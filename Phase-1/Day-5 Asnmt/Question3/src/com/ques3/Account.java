package com.ques3;

public class Account {
	private int accountId;
	private String accountType;
	private int bal;
	
	
	public boolean withdraw(int amt) {
		if(bal-amt>=0) {
			bal-=amt;
			System.out.println("Balance Amount After Withdraw : "+bal);
			return true;
		}else {
			System.out.println("Sorry!!! No enough Balance ");
			return false;
		}
	}
	
	public void setId(int id) {
		this.accountId = id;
	}
	public int getId() {
		return accountId;
	}
	public void setaccountType(String name) {
		this.accountType = name;
	}
	public String getaccountType() {
		return accountType;
	}
}
