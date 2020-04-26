package org.websparrow.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.websparrow.proxy.fallback.ReportServiceFallback;

@FeignClient(name = "report-service", url = "http://localhost:8081", fallback = ReportServiceFallback.class)
public interface ReportServiceProxy {

	@GetMapping("/reports")
	public List<String> reports();

}
