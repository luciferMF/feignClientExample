package org.websparrow.proxy.fallback;

import java.util.Arrays;
import java.util.List;

import org.websparrow.proxy.ReportServiceProxy;

public class ReportServiceFallback implements ReportServiceProxy {

	private Throwable cause;
	public ReportServiceFallback(Throwable cause) {
		this.cause = cause;
	}

	@Override
	public List<String> reports() {
		System.out.println(cause);
		return Arrays.asList(cause.getMessage());
	}
}
