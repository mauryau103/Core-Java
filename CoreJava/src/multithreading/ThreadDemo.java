package multithreading;
public class ThreadDemo{
    public static void main(String[] args) throws InterruptedException {

        Thread t1=new Thread(() -> {
            for(int i=1;i<=5;i++){
            	try{Thread.sleep(1000);} 
                catch(Exception e){}
                System.out.println("Hi");
            }
           
        });
      
        Thread t2=new Thread(() -> {
        	 for(int i=1;i<=5;i++){
             	try{Thread.sleep(1000);} 
                 catch(Exception e){}
                 System.out.println("Hello");
             }
        });
        
//        System.out.println("Hello Rahul");
       
        t1.start();
        t1.join();
//       try{ Thread.sleep(1000);}
//       catch(Exception e){}
        t2.start();       
//      t2.join();
//        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getName());
       

    }
}