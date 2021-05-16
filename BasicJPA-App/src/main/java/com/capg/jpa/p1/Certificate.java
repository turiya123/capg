package com.capg.jpa.p1;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	
	@Column(name = "certificateNumber")
	private int certificateNumber;
	private String certificateName;
	private String issuer;
	
	
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCertificateNumber() {
		return certificateNumber;
	}
	public void setCertificateNumber(int certificateNumber) {
		this.certificateNumber = certificateNumber;
	}
	public String getCertificateName() {
		return certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	public String getIssuer() {
		return issuer;
	}
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}
	
}
