package com.tcs.bank;

public class Account {
	private String accountNo;
	private String accountType;
	private String owner;

	public Account() {

	}

	public Account(String accountNo, String accountType, String owner) {
		super();
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.owner = owner;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
