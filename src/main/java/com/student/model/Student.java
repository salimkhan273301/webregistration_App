package com.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Register")


public class Student {


	@ Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String branch;
	
	@Column
	private String country;
	@Column
	private String city;
	@Column
	private String password;
	public Student(String name, String email, String branch, String country, String city, String password) {
		super();
		this.name = name;
		this.email = email;
		this.branch = branch;
		this.country = country;
		this.city = city;
		this.password = password;
	}
	public Student() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", branch=" + branch + ", country="
				+ country + ", city=" + city + ", password=" + password + "]";
	}

	
	
	
}