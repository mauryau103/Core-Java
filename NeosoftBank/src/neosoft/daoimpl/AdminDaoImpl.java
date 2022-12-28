package neosoft.daoimpl;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import neosoft.dao.AdminDao;
import neosoftbank.model.Customer;

public class AdminDaoImpl implements AdminDao{

	Set<Customer> customerSet=new HashSet<>();
	Customer customer=new Customer();
	@Override
	public void createaccount() {
		try (
		Scanner scanner = new Scanner(System.in)) {
			Long accountNo;
			String name;
			int age;
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
				customer.setAccNo(accountNo);
				customer.setName(name);
				customer.setAge(age);
				System.out.println(customer.getName());
				System.out.println(name + " Your Account is successfully Opened.");
			}
		}
		customerSet.add(customer);
		System.out.println(customerSet);
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewallcustomer() {
		// TODO Auto-generated method stub
		
	}

}
