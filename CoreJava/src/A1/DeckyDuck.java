package A1;

public class DeckyDuck extends Duck {

	public DeckyDuck(Flyable flyable, Quackable quackable) {
		super(flyable, quackable);
	}// DeckyDuck(-,-)
	
	// first static block
		static {
			System.out.println("DeckyDuck : first static block");
		}//static
		
		// second static block
		static {
			System.out.println("DeckyDuck : second static block");
		}//static

		// first non static block
		{
			System.out.println("DeckyDuck : first  non static block");
		}//non static
		
		{
			System.out.println("DeckyDuck : second non static block");
		}//non static

	@Override
	public void fly() {
		System.out.println("DeckyDuck : fly");
	}// fly

	@Override
	public void quack() {
		System.out.println("DeckyDuck : quack");
	}// quack

	@Override
	public void swim() {
		System.out.println("DeckyDuck : swim");
	}// swim

}// class