package org.websparrow.proxy.errordecoder;

import org.websparrow.exception.CustomException;

import feign.Response;

public class ErrorDecoder implements feign.codec.ErrorDecoder {

	private final feign.codec.ErrorDecoder defaultErrorDecoder = new Default();
	@Override
	public Exception decode(String methodKey, Response response) {
		System.out.println("From Decoder");
		if(response.status()>=400&&response.status()<=499)
			return new CustomException(response.reason());
		return defaultErrorDecoder.decode(methodKey, response);
	}

}
