package Adapter;

public class AdapterTest {
	
	public static void main(String[] args) {
		/*���������ģʽ*/
//		Targetable target =new Adapter();
//		target.method1();
//		target.method2();
		/*�����������ģʽ*/
//		Source source=new Source();
//		Targetable target =new Adapter(source);
//		target.method1();
//		target.method2();
		/*�ӿڵ�������ģʽ*/
		Targetable target1=new Targetable1();
		Targetable target2=new Targetable2();
		target1.method1();
		target1.method2();
		target2.method1();
		target2.method2();
	}

}
