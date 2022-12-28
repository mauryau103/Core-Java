package neosoftbank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import neosoftbank.model.Customer;
import neosoftbank.service.AdminOperation;
import neosoftbank.service.CustomerOperation;

public class NeosoftBank {
	
	
	
	AdminOperation adminOperation=new AdminOperation();
	CustomerOperation customerOperation=new CustomerOperation();
     
	public static List<Customer> customerinfo=new ArrayList<>();
	
	
	public void mainmethod() {
		
//		customerinfo.add(new Customer("umesh", 123l, 0L, 21));
//		customerinfo.add(new Customer("umesh", 234L, 0L, 21));

		System.out.println("Welcome to Neosoft Bank.");
		System.out.println("What you want to do:\n 1.Login As admin \n 2.Login as User \n 3.Exit");
		try (Scanner scanner = new Scanner(System.in)) {
			int choice; 
			do {
			choice	= scanner.nextInt();
			switch (choice) {
			case 1: {
				adminOperation.adminoperation();
				return;
			}
			case 2: {
				customerOperation.customeroperation();
				return;
			}
			case 3: {
				System.out.println("exit");
				return;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			} while (choice<4);
		}
		
	}
public static void main(String[] args) {
	
	NeosoftBank neosoftBank=new NeosoftBank();
	
	neosoftBank.mainmethod();
	
}
}