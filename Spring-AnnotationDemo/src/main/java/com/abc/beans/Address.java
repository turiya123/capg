package com.abc.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("New Delhi")
	private String cityName;
	@Value("Delhi")
	private String stateName;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(String cityName, String stateName) {
		super();
		this.cityName = cityName;
		this.stateName = stateName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", stateName=" + stateName + "]";
	}
	
	

}
