package sms.backend.home.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ElectionTest {
	
	
	public String getCitizen_name() {
		return citizen_name;
	}
	public void setCitizen_name(String citizen_name) {
		this.citizen_name = citizen_name;
	}
	public String getAadhar_number() {
		return aadhar_number;
	}
	public void setAadhar_number(String aadhar_number) {
		this.aadhar_number = aadhar_number;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	private String citizen_name;
	private String aadhar_number;
	private String country;
	

}
