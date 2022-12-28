package week2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListDeserialization {
	public static void main(String[] args) {
		// ArrayList instantiation
	      ArrayList<String> list = new ArrayList();
	     HashMap<String, Integer> hashMap ;
	      try {
	    	  
	          FileInputStream fileIS = new FileInputStream("inputfile");
	          ObjectInputStream objIS = new ObjectInputStream(fileIS);
	          list = (ArrayList) objIS.readObject();
	          objIS.close();
	          fileIS.close();
	       } 
	       catch(IOException ex) {
	          ex.printStackTrace(); 
	          return;
	       }
	       catch(ClassNotFoundException ex2) {
	          System.out.println(" Class Not Found Exception");
	          ex2.printStackTrace();
	          return;
	       }
	       // Printing the ArrayList
	       for(String s : list) {
	         System.out.println(s);
	       }    
	     }

	}

