package com.capg.jpa.p1;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "studentIdNumber")
	private int studentId;
	
	@Column(name=" StudentName")
	private String studentName;
	
	@Embedded
	private Certificate technicalCertificate;
	
	@AttributeOverrides({
		@AttributeOverride(name = "certificateNumber",column = @Column(name="nonTechnicalcertificateNumber")),
		@AttributeOverride(name = "certificateName",column = @Column(name="nonTechnicalcertificateName")),
		@AttributeOverride(name = "issuer",column = @Column(name="nonTechnicalcertificateIssuer")),
	})
	private Certificate nonTechnicalCertificate;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Certificate getTechnicalCertificate() {
		return technicalCertificate;
	}

	public void setTechnicalCertificate(Certificate technicalCertificate) {
		this.technicalCertificate = technicalCertificate;
	}

	public Certificate getNonTechnicalCertificate() {
		return nonTechnicalCertificate;
	}

	public void setNonTechnicalCertificate(Certificate nonTechnicalCertificate) {
		this.nonTechnicalCertificate = nonTechnicalCertificate;
	}

}
