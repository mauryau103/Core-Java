package week1;


class Thread1 extends Thread{
	ObjectLockClassLock object = null;
	Thread1(ObjectLockClassLock object){
		this.object=object;
		
	}
	
	public void run() {
		object.m1();
		object.m2();
	}
}

class Thread2 extends Thread{
	ObjectLockClassLock object = null;
	Thread2(ObjectLockClassLock object){
		this.object = object;
	}
	
	public void run() {
		object.m1();
		object.m2();
		
	}
}

public class ObjectLockClassLock{

	
	public synchronized void m1() {
		System.out.println("in Method M1() and Thread Name is "+Thread.currentThread().getName());
	}
	public synchronized void m2() {
		
		System.out.println("in Method M2() and Thread Name is "+Thread.currentThread().getName());

			
	}
	public static void main(String[] args) {
		
		ObjectLockClassLock object = new ObjectLockClassLock();
		
		Thread1 thread1 = new Thread1(object);
		Thread2 thread2 = new Thread2(object);
		
		thread1.start();
		thread2.start();
	}

}
