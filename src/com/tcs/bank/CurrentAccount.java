package com.tcs.bank;

import java.util.Date;

public class CurrentAccount extends Account {
	private double balance;
	private final String type = "current";
	private Date createDate;
	private String status;
	private double overDraftBalance;

	public CurrentAccount(String accountNo, String accountType,double balance, Date createDate, String status) {
		super(accountNo,accountType);
		this.balance = balance;
		this.createDate = createDate;
		this.status = status;
		this.overDraftBalance = 85000;
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

	public double getOverDraftBalance() {
		return overDraftBalance;
	}

	public void setOverDraftBalance(double overDraftBalance) {
		this.overDraftBalance = overDraftBalance;
	}

}
