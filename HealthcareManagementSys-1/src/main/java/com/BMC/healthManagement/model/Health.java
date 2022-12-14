package com.BMC.healthManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "products_info")
public class Health {

	
	@Id
	@GeneratedValue
	private int patientId;
	private String patientName;
	private int patientAge;
	@Column(name = "description")
	private String patientDesc;
	private String productAddr;
	
	
	
	@Override
	public String toString() {
		return "Health [patientId=" + patientId + ", patientName=" + patientName + ", patientAge=" + patientAge
				+ ", patientDesc=" + patientDesc + ", productAddr=" + productAddr + "]";
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	public String getPatientDesc() {
		return patientDesc;
	}
	public void setPatientDesc(String patientDesc) {
		this.patientDesc = patientDesc;
	}
	public String getProductAddr() {
		return productAddr;
	}
	public void setProductAddr(String productAddr) {
		this.productAddr = productAddr;
	}
	
	public Health() {
		// TODO Auto-generated constructor stub
	}
	public Health(int patientId, String patientName, int patientAge, String patientDesc, String productAddr) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientDesc = patientDesc;
		this.productAddr = productAddr;
	}
	
	
}
