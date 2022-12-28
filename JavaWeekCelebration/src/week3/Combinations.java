package week3;

public class Combinations {
	
	public static void main(String[] args) {
		
//		try {
//			try {
//				
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//		}
//		finally {
//			
//		}
		
	}

}


/*Allowed Possible Combinations*/
/*
1.try,catch,finally
2.try,finally
3.try,catch
4.try,catch,catch.....parent exception should be in last.
5.try,catch,catch.....both catch block having same exception ---> then throws compile time error that is already handled.
6.try {try,catch},catch
7.try,catch {try,finally }
8.try,catch,finally,try,catch,finally
*/

/*Not Allowed Possible Combinations*/
/*
1.catch,finally --error invalid record headers
2.try    --> Error try without catch,finally.
3.catch
4.try,statement,catch -->error try without catch and finally
5.finally --> finally without try
6.try,finally,finally --> finally without try
7.try,finally,catch  -->catch without try
8.try {try,catch}
9.try,catch{try,catch},finally{finally} -->finally without try -->last block of finally
10.finally,try,catch --. finally without try
*/