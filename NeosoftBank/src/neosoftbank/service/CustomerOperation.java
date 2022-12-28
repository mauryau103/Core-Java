package neosoftbank.service;


import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.Scanner;



import neosoftbank.NeosoftBank;
import neosoftbank.model.Customer;
import neosoftbank.model.Transaction;
import nesoftbank.util.TransactionType;





public class CustomerOperation implements Cloneable{
	
	Customer customer = new Customer();
	Customer currentCustomer=null;
	Long accountno=0l;
	AdminOperation adminOperation = new AdminOperation();
	public void customeroperation() {
		
		int choice = 0;
		String username;
		Double amount;
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("Welcome to User Console");
			
			System.out.println("Enter AccountNo:");
			accountno=scanner.nextLong();
			System.out.println("Enter UserName:");
			username=scanner.next();
			
			do {
					
				Optional<Customer> optional = NeosoftBank.customerinfo.stream().filter(item-> item.getAccNo().equals(accountno) && item.getName().equals(username)).findFirst();
				
				if(optional.isPresent()) {
					currentCustomer=optional.get();
					System.out.println("What you want to do:\n 1.View account details \n 2.View All Transaction \n 3.Transfer Money \n 4.View Last 5 Transaction \n 5.Log Out");

				
			choice	= scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("View account details");
				System.out.println(optional);
				break;
			}
			case 2: {
				System.out.println("View All Transaction");
				List<Transaction> c2=currentCustomer.getTransactionList();
				for(Transaction customer:c2) {
					System.out.println(customer.getDate()+" | "+customer.getAmount()+" | "+customer.getTransactionType());
				}
				break;
			}
			case 3: {
				
				Long benificeryaccountno;
				
				System.out.println("Transfer Money");
				Customer reciverCustomer=null;
				//Transaction transaction=nul1
				
				System.out.println("Enter benificery Accno.");
				benificeryaccountno=scanner.nextLong();
				
				Optional<Customer> optional2 = NeosoftBank.customerinfo.stream().filter(item-> item.getAccNo().equals(benificeryaccountno)).findAny();
				
				System.out.println(optional2);
				
				if(optional2.isPresent()) {
					reciverCustomer=optional2.get();
					
					System.out.println("Enter Amount to be withdraw.");
					amount = (double) scanner.nextLong();
					
					if(amount<currentCustomer.getBal()) {
						double newamount=reciverCustomer.getBal()+amount;
						double senderamount=currentCustomer.getBal()-amount;						
						
						currentCustomer.setBal(senderamount);
						reciverCustomer.setBal(newamount);
						
						Transaction cTransaction=new Transaction(TransactionType.Withdraw,amount,currentCustomer.getBal(),new Date());
						Transaction rTransaction=new Transaction(TransactionType.Deposit,amount,reciverCustomer.getBal(),new Date());
						
						currentCustomer.getTransactionList().add(cTransaction);
						reciverCustomer.getTransactionList().add(rTransaction);
								
					}
					else {
						System.out.println("---Insuffiecient Balance----");
					}
					System.out.println("Current Balance:"+currentCustomer.getBal());

				}
				
				else {
					System.out.println("Account is not available");
				}
				System.out.println(NeosoftBank.customerinfo);
				
				break;
			}
			case 4: {
				
				
//				List list = Arrays.asList(1, 2, 3, 4);
//			    ListIterator i = list.listIterator(list.size());
//			    while (i.previousIndex() != list.size() - 4) {
//			        Object e = i.previous();
//			        System.out.print(e + " ");
//			    }
				
				System.out.println("View Last 5 Transaction");
				
				ListIterator<Transaction> listT=currentCustomer.getTransactionList().listIterator(currentCustomer.getTransactionList().size());
				
				try {
					
				while(listT.previousIndex() !=currentCustomer.getTransactionList().size()-6) {
					Object e = listT.previous();
					if(e!=null) {
						System.out.println(e + " ");
					}
					
				}
				} catch (Exception e) {
					System.out.println("You have this much transaction only...");
				}
				
				//System.out.println(currentCustomer.getTransactionList());
				
				break;
			}
			case 5: {
				System.out.println("Log Out");
				System.out.println("Thank U for Visiting Us. Visit Again!");
				NeosoftBank.main(null);
				return;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			}
				else {
					System.out.println("Username and Account no was incorrect");
					NeosoftBank.main(null);
				}
			} while (choice<6);
		}
		
}
}