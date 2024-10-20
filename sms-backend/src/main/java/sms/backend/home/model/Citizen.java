package sms.backend.home.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Table(name="citizen")
@Entity

public class Citizen {
	@Id
	@Column(name ="citizen_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer citizen_id;
	@Column(name ="citizen_name")
	private String citizen_name;
	@Column(name ="aadhar_number")
	private String aadhar_number;
	@Column(name ="country")
	private String country;
	public Integer getCitizen_id() {
		return citizen_id;
	}
	public void setCitizen_id(Integer citizen_id) {
		this.citizen_id = citizen_id;
	}
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
	
	

}
