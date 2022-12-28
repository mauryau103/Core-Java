package multithreading;

public class Mul1 implements Runnable
{
public void run()
{
 System.out.println("Child thread is running");
 for(int i = 1; i <= 4; i++)
 {
  System.out.println("I: " +i);
 }
System.out.println("Child thread is ending");
}
public static void main(String[] args)
{
 Mul1 x = new Mul1();
 Thread t = new Thread(x);
  t.start(); // thread t is ready to run.

// join() method is called inside the main thread (current thread) through Thread t.
try
{
  t.join(); // Wait for thread t to end.
}
catch(InterruptedException ie)
{
  ie.printStackTrace();
}
  System.out.println("Main Thread is ending");
}}