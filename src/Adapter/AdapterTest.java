package Adapter;

public class AdapterTest {
	
	public static void main(String[] args) {
		/*类的适配器模式*/
//		Targetable target =new Adapter();
//		target.method1();
//		target.method2();
		/*对象的适配器模式*/
//		Source source=new Source();
//		Targetable target =new Adapter(source);
//		target.method1();
//		target.method2();
		/*接口的适配器模式*/
		Targetable target1=new Targetable1();
		Targetable target2=new Targetable2();
		target1.method1();
		target1.method2();
		target2.method1();
		target2.method2();
	}

}
