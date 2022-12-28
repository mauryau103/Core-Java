package A1;

public abstract class Duck implements Flyable, Quackable {
	Flyable flyable;
	Quackable quackable;

	// parameterized Constructor
	public Duck(Flyable flyable, Quackable quackable) {
		this.flyable = flyable;
		this.quackable = quackable;
	}// Duck(-,-)

	// first static block
	static {
		System.out.println("Duck : first static block");
	}
	// second static block
	static {
		System.out.println("Duck : second static block");
	}

	// first non static block
	{
		System.out.println("Duck : first  non static block");
	}
	{
		System.out.println("Duck : second non static block");
	}

	public abstract void swim(); // abstract method

}// class