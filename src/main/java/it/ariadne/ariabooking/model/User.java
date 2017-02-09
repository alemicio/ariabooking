package it.ariadne.ariabooking.model;

import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	// ======================================================================================================== Attributes
	private String 	username;
	private String 	password;
	private String 	name;
	private String 	surname;
	private String 	eMail;
	private String 	phoneNumber;
	private Boolean isAdmin;

	// ======================================================================================================== Constructor
	public User(String username, String password, String name, String surname, String eMail, String phoneNumber) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.eMail = eMail;
		this.phoneNumber = phoneNumber;
		this.isAdmin = false;
	}
	// ======================================================================================================== Getters & Setters
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Boolean getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", name=" + name + ", surname=" + surname
				+ ", eMail=" + eMail + ", phoneNumber=" + phoneNumber + ", isAdmin=" + isAdmin + "]";
	}
		
}