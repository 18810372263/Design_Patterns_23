package Builder;

public class Test {
	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.produceMailSender(10);
		System.out.println(builder.len());
	}
}
