package com.abc.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MedicalPolicy extends Policy {

	@Value("5050505")
	private int medicalCap;

	public MedicalPolicy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MedicalPolicy(int medicalCap) {
		super();
		this.medicalCap = medicalCap;
	}

	public int getMedicalCap() {
		return medicalCap;
	}

	public void setMedicalCap(int medicalCap) {
		this.medicalCap = medicalCap;
	}

	@Override
	public String toString() {
		return "MedicalPolicy [medicalCap=" + medicalCap + "]";
	}
	
	
}
