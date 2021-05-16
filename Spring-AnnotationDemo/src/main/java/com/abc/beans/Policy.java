package com.abc.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public abstract class Policy {

	@Value("19191")
	private int pilicyId;
	@Value("Policy-123")
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
