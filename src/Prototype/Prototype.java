package Prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Prototype implements Cloneable {
	/*ǳ����*/
	public Object clone() throws CloneNotSupportedException{
		Prototype proto =(Prototype) super.clone();
		return proto;
	}
	/*���*/
	public Object deepClone() throws IOException, ClassNotFoundException {
		/*д�뵱ǰ����Ķ�������*/
		ByteArrayOutputStream bos =new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bos);//IOException
		oos.writeObject(this);
		/*���������Ʋ������¶���*/
		ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(bis);
		return ois.readObject();//ClassNotFoundException
	}
}
