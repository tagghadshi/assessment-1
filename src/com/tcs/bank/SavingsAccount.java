package com.tcs.bank;

import java.util.Date;

public class SavingsAccount extends Account {
	private double balance;
	private final String type = "savings";
	private Date createDate;
	private String status;

	public SavingsAccount(double balance, Date createDate, String status) {
		super();
		this.balance = balance;
		this.createDate = createDate;
		this.status = status;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

}
