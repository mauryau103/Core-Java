package Lambda;

//this interface can go for lambda as well as for annonymous
interface P {
	void m1();
}

//this interface can only go for annonymous class implementation 
interface Q {
	void m1();

	void m2();

}

class MyClassJi {
	void m3() {
		System.out.println("This is method 3 of my classJi");
	}
}

/*
 * 
 * It means Annonymous inner class is more powerful then lambda expression
 * 
 */
public class AnnonymouusAndLambdaDemo {

	public static void main(String[] args) {

		P p = () -> System.out.println("I am in method 1");
		p.m1();

		Q q = new Q() {

			@Override
			public void m2() {
				// TODO Auto-generated method stub

			}

			@Override
			public void m1() {
				// TODO Auto-generated method stub

			}
		};

		P p2 = new P() {

			@Override
			public void m1() {
				// TODO Auto-generated method stub

			}
		};
		MyClassJi myClassJi = new MyClassJi() {
			// this is now overriden
			public void m3() {
				System.out.println("Inside annonymous class os myclass ji of m3");
			}
		};

		myClassJi.m3();

	}

}
