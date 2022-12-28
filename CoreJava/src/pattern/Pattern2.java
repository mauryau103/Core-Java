package pattern;



// *
// **
// ***
// ****
// *****
public class Pattern2 {
	public static void main(String[] args) {
		for(int i=5;i>=0;i--) {
			for(int j=1;j<=5;j++) {
				
				if (j<=5-i) {
					System.out.print(" ");
				}
				
				else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
	}

}
