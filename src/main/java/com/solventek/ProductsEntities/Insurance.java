package com.solventek.ProductsEntities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity


public class Insurance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 int insuranceId;
	 String insuranceName;
	 long insuranceValue;
	 long insurancePremium;
	 
	public Insurance() {
		
	}
	
	

	public int getInsuranceId() {
		return insuranceId;
	}



	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}



	public String getInsuranceName() {
		return insuranceName;
	}



	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}



	public long getInsuranceValue() {
		return insuranceValue;
	}



	public void setInsuranceValue(long insuranceValue) {
		this.insuranceValue = insuranceValue;
	}



	public long getInsurancePremium() {
		return insurancePremium;
	}



	public void setInsurancePremium(long insurancePremium) {
		this.insurancePremium = insurancePremium;
	}


	

	public Insurance(int insuranceId, String insuranceName, long insuranceValue, long insurancePremium) {
		super();
		this.insuranceId = insuranceId;
		this.insuranceName = insuranceName;
		this.insuranceValue = insuranceValue;
		this.insurancePremium = insurancePremium;
	}



	@Override
	public String toString() {
		return "Insurance [insuranceId=" + insuranceId + ", insuranceName=" + insuranceName + ", insuranceValue="
				+ insuranceValue + ", insurancePremium=" + insurancePremium + "]";
	}
	 
	 

}
