package Factory_Method_13;

public class MailSender implements Sender {
		@Override
		public void Send() {
			System.out.println("this is mailsender!");
		}
}
