package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	@Id
	@Column(name="user_id")
	int User_id;
	@Column(name="password")
	String password;
	@Column(name="email")
	String email;
	@Column(name="f_name")
	String f_name;
	@Column(name="l_name")
	String l_name;
	@Column(name="role")
	String role;
	@Override
	public String toString() {
		return "Users [User_id=" + User_id + ", password=" + password + ", email=" + email + ", f_name=" + f_name
				+ ", l_name=" + l_name + ", role=" + role + "]";
	}
	public Users(int user_id, String password, String email, String f_name, String l_name, String role) {
		super();
		User_id = user_id;
		this.password = password;
		this.email = email;
		this.f_name = f_name;
		this.l_name = l_name;
		this.role = role;
	}
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int user_id) {
		User_id = user_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	

}
