package neosoftbank.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private Long accNo;
	private double bal=0L;
	private int age;
	
	private List<Transaction> transactionList=new ArrayList<>();
	
	
	public List<Transaction> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}

	public Customer() {
		super();
	}
	
	public Customer(String name, Long accNo, Long bal, int age, List<Transaction> transactionList) {
		super();
		this.name = name;
		this.accNo = accNo;
		this.bal = bal;
		this.age = age;
		this.transactionList = transactionList;
	}

	public Customer(String name, Long accNo, Long bal,int age) {
		super();
		this.name = name;
		this.accNo = accNo;
		this.bal = bal;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAccNo() {
		return accNo;
	}
	public void setAccNo(Long accNo) {
		this.accNo = accNo;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double d) {
		this.bal = d;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", accNo=" + accNo + ", bal=" + bal + ", age=" + age + "]";
	}
	
	public void addTransaction(Transaction transaction) {
		if(this.transactionList == null)
			this.transactionList = new ArrayList<>();
		this.transactionList.add(transaction);
	}
	

}
