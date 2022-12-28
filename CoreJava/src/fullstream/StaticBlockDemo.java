package fullstream;

import java.util.Random;

public class StaticBlockDemo {

	static int[] values = new int[10];

	static {
		System.out.println("StaticBlockDemo : static block");
		for (int i = 0; i < values.length; i++) {
			values[i] = new Random().nextInt();
		} // for
	}// static block

	public void listValues() {
		for (int i = 0; i < 10; i++) {
			System.out.println(values[i]);
		} // for
	}// listValues

	public static void main(String[] args) {
		// create instance
		StaticBlockDemo static1 = null, static2 = null;

		static1 = new StaticBlockDemo();
		static2 = new StaticBlockDemo();

		static1.listValues();
		System.out.println("--------------------------------------");
		static2.listValues();
	}// main
}