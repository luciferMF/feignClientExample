package org.websparrow.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.websparrow.proxy.errordecoder.ErrorDecoder;

@Configuration
public class FeignConfig {

	@Bean
	public ErrorDecoder errorDecoder() {
		return new ErrorDecoder();
	}
}
