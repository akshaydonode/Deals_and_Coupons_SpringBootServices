package com.capgemini.signup_inservice.entity;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	
	private Long u_id;
	private String name;
	private String username;
	private String password;
	private Long mobileNo;
	private String email;
	private String address;
	private String city;
	private String state;
	private String gender;
	private String schoolName;
	private Date dateOfBirth;
	
	public User() {
		super();
	}

	public User(Long u_id, String name, String username, String password, Long mobileNo, String email, String address,
			String city, String state, String gender, String schoolName, Date dateOfBirth) {
		super();
		this.u_id = u_id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.mobileNo = mobileNo;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.gender = gender;
		this.schoolName = schoolName;
		this.dateOfBirth = dateOfBirth;
	}

	public Long getU_id() {
		return u_id;
	}

	public void setU_id(Long u_id) {
		this.u_id = u_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", mobileNo=" + mobileNo + ", email=" + email + ", address=" + address + ", city=" + city + ", state="
				+ state + ", gender=" + gender + ", schoolName=" + schoolName + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
}
