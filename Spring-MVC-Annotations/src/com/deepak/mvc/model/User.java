package com.deepak.mvc.model;

/**
 * @author deepak
 *
 */
public class User {

	private String username;
	private String password;
	private String gender;
	private String city;

	public User() {

	}

	public User(String username, String password, String gender, String city) {
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.city = city;
	}

	// Getter and Setter

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
