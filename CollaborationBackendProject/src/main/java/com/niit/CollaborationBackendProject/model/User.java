package com.niit.CollaborationBackendProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_s180015")
public class User 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int usr_Id;
private String username;
private String password;
private String role;
private String firstname;
private String lastname;
@Column(unique=true,nullable=false)
private String email;
private String phonenumber;
@Column(name="ison_line")
private boolean isOnline;
public int getUsr_Id() {
	return usr_Id;
}
public void setUsr_Id(int usr_Id) {
	this.usr_Id = usr_Id;
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
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
public boolean isOnline() {
	return isOnline;
}
public void setOnline(boolean isOnline) {
	this.isOnline = isOnline;
}


}
