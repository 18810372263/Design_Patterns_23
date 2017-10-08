package Adapter;

/*���������ģʽ*/
//public class Adapter extends Source implements Targetable{
//	
//	@Override
//	public void method2() {
//		System.out.println("this is the targetable method");
//	}
//
//}

/*�����������ģʽ*/
//public class Adapter implements Targetable{
//	private Source source;
//	
//	public Adapter(Source source) {
//		super();
//		this.source=source;
//	}
//	
//	@Override
//	public void method1() {
//		source.method1();
//	}
//	
//	@Override
//	public void method2() {
//		System.out.println("this is the targetable method");
//	}
//
//}

/*�ӿڵ�������ģʽ*/
public abstract class Adapter implements Targetable{
	
	@Override
	public void method1() {
		System.out.println("this is Adapter method1");
	}
	
	@Override
	public void method2() {
		System.out.println("this is Adapter method2");
	}

}