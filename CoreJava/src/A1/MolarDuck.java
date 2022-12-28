package A1;

public class MolarDuck extends Duck {

	public MolarDuck(Flyable flyable, Quackable quackable) {
		super(flyable, quackable);
	}// MolarDuck(-,-)
	
	// first static block
		static {
			System.out.println("MolarDuck : first static block");
		}//static
		
		// second static block
		static {
			System.out.println("MolarDuck : second static block");
		}//static

		// first non static block
		{
			System.out.println("MolarDuck : first  non static block");
		}//non static
		
		{
			System.out.println("MolarDuck : second non static block");
		}//non static

	@Override
	public void fly() {
		System.out.println("MolarDuck : fly");
	}// fly

	@Override
	public void quack() {
		System.out.println("MolarDuck : quack");
	}// quack

	@Override
	public void swim() {
		System.out.println("MolarDuck : swim");
	}// swim

}// class