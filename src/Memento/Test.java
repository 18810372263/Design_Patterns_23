package Memento;

public class Test {
	
	public static void main(String[] args) {
		
		//����ԭʼ��
		Original original = new Original("egg");
		
		//��������¼		
		Storage storage = new Storage(original.createMemento()); 
		
		//�޸�ԭʼ���״̬ 
		System.out.println("��ʼ״̬Ϊ: "+original.getValue());
		original.setValue("niu");
		System.out.println("�޸ĺ��״̬Ϊ: "+original.getValue());
		
		//�ָ�ԭʼ���״̬  
		original.restoreMemento(storage.getMemento());
		System.out.println("�ָ����״̬Ϊ: "+original.getValue());
	}

}
