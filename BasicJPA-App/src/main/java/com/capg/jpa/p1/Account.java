package com.capg.jpa.p1;

import java.time.LocalDate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity   
@Table(name = "MyAccounts")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "accountNumber")
	private int accId;
	
	@Column(name=" AccountName")
	private String accountHolderName;
	
	private int balance;
	
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDate openningDate;
	
	@Embedded
	private Address address;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "houseNumber",column = @Column(name="office_Address")),
		@AttributeOverride(name = "cityName",column = @Column(name="office_cityName")),
		@AttributeOverride(name = "state",column = @Column(name="office_state")),
	})
	private Address office_address;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public LocalDate getOpenningDate() {
		return openningDate;
	}



	public void setOpenningDate(LocalDate openningDate) {
		this.openningDate = openningDate;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public Address getOffice_address() {
		return office_address;
	}



	public void setOffice_address(Address office_address) {
		this.office_address = office_address;
	}



	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accountHolderName=" + accountHolderName + ", balance=" + balance + "]";
	}
	
	

}