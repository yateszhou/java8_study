package study.java8;

public class LambdaTest {
	
	public static void main(String[] args) {
		Add add= (a, b) -> a+ b;
		int a= add.add(3, 6);
		System.out.println(a);
	}

	/**
	 * ±¾µØÌí¼Ó×¢ÊÍ
	 *
	 */
	public static interface Add{
		public int add(int a, int b);
	}
}
