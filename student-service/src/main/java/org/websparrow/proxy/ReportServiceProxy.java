package org.websparrow.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.websparrow.proxy.fallback.factory.ReportServiceFallbackFactory;

@FeignClient(name = "report-service", url = "http://localhost:8081", fallbackFactory =  ReportServiceFallbackFactory.class)
public interface ReportServiceProxy {

	@GetMapping("/reportss")
	public List<String> reports();

}
