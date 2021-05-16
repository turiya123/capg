package com.mkj.abc.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Insurance {

	@Value("#{account.balance*0.10}")
	private int premiumAmount;

	public int getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(int premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	
	
}
