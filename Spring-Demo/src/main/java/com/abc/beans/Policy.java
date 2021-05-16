package com.abc.beans;

public class Policy {

	private int pilicyId;
	private String policyName;
	
	public Policy() {
		// TODO Auto-generated constructor stub
	}

	public int getPilicyId() {
		return pilicyId;
	}

	public void setPilicyId(int pilicyId) {
		this.pilicyId = pilicyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	@Override
	public String toString() {
		return "Policy [pilicyId=" + pilicyId + ", policyName=" + policyName + "]";
	}

	
}