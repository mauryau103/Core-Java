package neosoftbank.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import nesoftbank.util.TransactionType;

public class Transaction {
	
	private Date date;
	private TransactionType transactionType;
	private double amount;
	private double balance;
	
	public Transaction(TransactionType transactionType, double amount, double balance,Date date) {
		super();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		//date = dtf.format(now);
		
		this.transactionType = transactionType;
		this.amount = amount;
		this.balance = balance;
		this.date=date;
	}

	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Transaction(Date date, TransactionType transactionType, double amount,double balance) {
		super();
		this.date = date;
		this.transactionType = transactionType;
		this.amount = amount;
		this.balance=balance;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Transaction [date=" + date + ", transactionType=" + transactionType + ", amount=" + amount
				+ ", balance=" + balance + "]";
	}
	
	
	
	
	
	
	
	
	
}
//public class Transaction {
//
//	private LocalDateTime d;
//	private String type;
//	private double amt;
//	private double bal;
//	public Transaction(LocalDateTime d, String type, double amt, double bal) {
//		super();
//		this.d = d;
//		this.type = type;
//		this.amt = amt;
//		this.bal = bal;
//	}
//	public Transaction() {
//		super();
//	}
//	@Override
//	public String toString() {
//		return "Transaction [d=" + d + ", type=" + type + ", amt=" + amt + ", bal=" + bal + "]";
//	}
//	public LocalDateTime getD() {
//		return d;
//	}
//	public void setD(LocalDateTime now) {
//		this.d = now;
//	}
//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
//	public double getAmt() {
//		return amt;
//	}
//	public void setAmt(double amt) {
//		this.amt = amt;
//	}
//	public double getBal() {
//		return bal;
//	}
//	public void setBal(double bal) {
//		this.bal = bal;
//	}
//	
//	
//}
