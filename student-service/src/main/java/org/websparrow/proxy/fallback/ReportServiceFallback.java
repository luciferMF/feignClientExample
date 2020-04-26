package org.websparrow.proxy.fallback;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.websparrow.proxy.ReportServiceProxy;

@Component
@Scope("prototype")
public class ReportServiceFallback implements ReportServiceProxy {

	@Override
	public List<String> reports() {
		return Arrays.asList("null");
	}

}
