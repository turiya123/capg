package com.abc.beans;

import org.springframework.stereotype.Component;

@Component
public class InsurancePolicy extends Policy {

	private int sumAssured;

	public InsurancePolicy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InsurancePolicy(int sumAssured) {
		super();
		this.sumAssured = sumAssured;
	}

	public int getSumAssured() {
		return sumAssured;
	}

	public void setSumAssured(int sumAssured) {
		this.sumAssured = sumAssured;
	}
	
	
}
