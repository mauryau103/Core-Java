package A1;

public class DuckSwimTest {

	public static void main(String[] args) {
		Flyable flyable = null;
		Quackable quackable = null;

		DeckyDuck dd = new DeckyDuck(flyable, quackable);
		dd.swim();
		
		System.out.println("----------------------------");

		MolarDuck md = new MolarDuck(flyable, quackable);
		md.swim();

	}// main
}// class
 