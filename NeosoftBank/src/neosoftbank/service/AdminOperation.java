package neosoftbank.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

import neosoftbank.NeosoftBank;
import neosoftbank.constant.BankConst;
import neosoftbank.model.Customer;
import neosoftbank.model.Transaction;
import nesoftbank.util.TransactionType;

public class AdminOperation {
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	LocalDateTime now = LocalDateTime.now();
	
	static final Map<Double, String> Credited = new HashMap<>();
	
	public void adminoperation() {
	
		int choice = 0; 
		Customer customer=new Customer();
		Double amount;
		String name;
		int age;
		String username;
		String password;
		
		try (Scanner scanner = new Scanner(System.in)) {
			
		System.out.println("Welcome to admin Console");
		
		System.out.println("Enter Username:");
		username=scanner.next();
		
		System.out.println("Enter Password:");
		password=scanner.next();
	
			do {
				Long accountNo;
				
				if (username.equals(BankConst.USERNAME) && password.equals(BankConst.PASSWORD)) {

					System.out.println("What you want to do:\n 1.Open an account for new Customer \n 2.Deposit \n 3.Withdraw \n 4.Delete an account \n 5.View all the customers of the bank \n 6.Log Out");
					
			choice	= scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Open an account for new Customer");
				System.out.println("Enter Accno.");
				accountNo=scanner.nextLong();
				System.out.println("Enter Name");
				name=scanner.next();
				System.out.println("Enter age");
				age=scanner.nextInt();
				if(age<18) {
					System.out.println("Enter valid age");
				}
				else {
					
				Customer customer1 = new Customer(name,accountNo,0L,age);
				NeosoftBank.customerinfo.add(customer1);
				
					System.out.println(name + " Your Account is successfully Opened.");
					
				}
				
				break;
			}
			case 2: {
				Transaction transaction=null;
				System.out.println("Deposit");
				System.out.println("Enter Accno.");
				accountNo=scanner.nextLong();
				System.out.println("Enter Amount to be deposited.");
				amount = (double) scanner.nextLong();
				
				Optional<Customer> optional = NeosoftBank.customerinfo.stream().filter(item-> item.getAccNo().equals(accountNo)).findAny();
				
				System.out.println(optional);
				if(optional.isPresent()) {
					customer = optional.get();	
					customer.setBal(customer.getBal()+amount);
					
					Credited.put(amount, dtf.format(now));
					String date=dtf.format(now);
					transaction = new Transaction(TransactionType.Deposit,amount,customer.getBal(),new Date());
					customer.addTransaction(transaction);
					System.out.println("Transaction List"+transaction);
					System.out.println("Current Balance:"+customer.getBal());

				}
				
				else {
					System.out.println("Account is not available");
				}
				System.out.println(NeosoftBank.customerinfo);
				
				break;
			}
			case 3: {
				System.out.println("Withdraw");
				Transaction transaction=null;
				System.out.println("Enter Accno.");
				accountNo=scanner.nextLong();
				System.out.println("Enter Amount to be withdraw.");
				amount = (double) scanner.nextLong();
				Optional<Customer> optional = NeosoftBank.customerinfo.stream().filter(item-> item.getAccNo().equals(accountNo)).findAny();
				
				System.out.println(optional);
				if(optional.isPresent()) {
					if(amount<customer.getBal()) {
						customer = optional.get();	
						customer.setBal(customer.getBal()-amount);
						
						Credited.put(amount, dtf.format(now));
						
						transaction = new Transaction(TransactionType.Deposit,amount,customer.getBal(),new Date());
						customer.addTransaction(transaction);
						System.out.println("Transaction List"+transaction);
					}
					else {
						System.out.println("insuficient balance");
					}
					System.out.println("Current Balance:"+customer.getBal());

				}
				
				else {
					System.out.println("Account is not available");
				}
				System.out.println(NeosoftBank.customerinfo);
				
				break;
			}
			case 4: {
				System.out.println("Delete an account");
				
				
				System.out.println("Enter Accno.");
				accountNo=scanner.nextLong();

				Optional<Customer> optional = NeosoftBank.customerinfo.stream().filter(item-> item.getAccNo().equals(accountNo)).findAny();
				
				System.out.println(optional);
				if(optional.isPresent()) {
					
					NeosoftBank.customerinfo.remove(optional.get());
					System.out.println("Account is successfully removed");

				}
				
				System.out.println(NeosoftBank.customerinfo);
				
				break;
			}
			case 5: {
				System.out.println("View all the customers of the bank");
				if(NeosoftBank.customerinfo.isEmpty()) {
					System.out.println("No record Found");
				}
				else {
					System.out.println(NeosoftBank.customerinfo);
					
				}
				
				break;
			}
			case 6: {
				System.out.println("Logout");
				System.out.println("Thank U for Visiting Us. Visit Again!");
				NeosoftBank.main(null);
				return;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
				}
				else {
					System.out.println("Username and Password was incorrect");
					NeosoftBank.main(null);
				}
			} while (choice<7);
		}
		
		
		}
		
	}
