package com.micro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GUEST")
public class guest {

	@Id
	@Column(name = "GUEST_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Guest_Id;
	@Column(name = "FIRST_NAME")
	private String First_name;
	@Column(name = "LAST_NAME")
	private String Last_name;
	@Column(name = "EMAIL_ADDRESS")
	private String Email;
	@Column(name = "ADDRESS")
	private String Address;
	@Column(name = "COUNTRY")
	private String Country;
	@Column(name = "STATE")
	private String State;
	@Column(name = "PHONE_NUMBER")
	private String Phone_number;

	public Integer getGuest_Id() {
		return Guest_Id;
	}

	public String getFirst_name() {
		return First_name;
	}

	public String getLast_name() {
		return Last_name;
	}

	public String getEmail() {
		return Email;
	}

	public String getAddress() {
		return Address;
	}

	public String getCountry() {
		return Country;
	}

	public String getState() {
		return State;
	}

	public String getPhone_number() {
		return Phone_number;
	}

	public void setGuest_Id(Integer guest_Id) {
		Guest_Id = guest_Id;
	}

	public void setFirst_name(String first_name) {
		First_name = first_name;
	}

	public void setLast_name(String last_name) {
		Last_name = last_name;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public void setState(String state) {
		State = state;
	}

	public void setPhone_number(String phone_number) {
		Phone_number = phone_number;
	}

}
