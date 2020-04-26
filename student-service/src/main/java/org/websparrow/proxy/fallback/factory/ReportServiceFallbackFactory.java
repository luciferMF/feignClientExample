package org.websparrow.proxy.fallback.factory;

import org.springframework.stereotype.Component;
import org.websparrow.proxy.ReportServiceProxy;
import org.websparrow.proxy.fallback.ReportServiceFallback;

import feign.hystrix.FallbackFactory;

@Component
public class ReportServiceFallbackFactory implements FallbackFactory<ReportServiceProxy>{

	@Override
	public ReportServiceProxy create(Throwable cause) {
		return new ReportServiceFallback(cause);
	}

}
