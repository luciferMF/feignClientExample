# feignClientExample
For feign fallback factory implementation follow below steps:
1: create a class which will extends FallBackFactory interface.
2: Implement its create method.
3: mark it with component anotation.
4: Add fallbackFactory property on ProxyInterface.

example:
@Component
public class ReportServiceFallbackFactory implements FallbackFactory<ReportServiceProxy>{

	@Override
	public ReportServiceProxy create(Throwable cause) {
		return new ReportServiceFallback(cause);
	}

}
