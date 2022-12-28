package week4;

class Under extends Over{ 
		//short test(){ 
			
			super.test(); 
			System.out.println("Under"); 
			return 1; 
			
		} 
} 


public class Over 
{ 
public static void main(String[] args){ 
Under u = new Under(); 
u.test(); 
} 
int test(){ 
System.out.println("over"); 
return 1; 
} 
} 
