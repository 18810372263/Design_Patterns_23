package Factory_Method_13;

public class FactoryTest {
	public static void main(String[] args) {	
		Sender sender = SendFactory.produceMail();
		sender.Send();
	}
}
