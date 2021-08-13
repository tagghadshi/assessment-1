package com.tcs.bank;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Bank {
	public static void main(String[] args) {
		Map<User,Account> accounts= new HashMap<User,Account> ();
		accounts.put(new User("Tag",(byte)23,"35 Street,Londan"), new SavingsAccount(new String("ABC1234567"),new String("Savings"), 373873,new Date(), new String("Open")));
		accounts.put(new User("TagCurrent",(byte)29,"07 Street,Paris"), new CurrentAccount(new String("ABC12340987"),new String("Current"), 679873,new Date(), new String("Open")));
		System.out.println(accounts);
		System.out.println();
	}
}
