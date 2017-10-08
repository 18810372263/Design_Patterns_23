package Proxy;

public class Proxy implements Sourceable{
	
	private Source source;
	
	public Proxy() {
		super();
		this.source=new Source();
	}
	
	@Override
	public void method() {
		System.out.println("before Proxy!");
		source.method();
		System.out.println("after Proxy!");
	}

}
