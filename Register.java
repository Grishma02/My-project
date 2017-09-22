package com.fashionista.Model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Register {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	int id;
	@Column
	String Name;

@Column
String pwd;
@Transient
String cpwd;

@Column
String email;

@Column
String address;


public String getName() {
	return Name;
}
public void setName(String Name) {
	this.Name = Name;
}

public int getId(){
	return id;
}
public void setId(int id){
this.id=id;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}



public String getPwd() {
	return pwd;
}


public void setPwd(String pwd) {
	this.pwd = pwd;
}

public String getCpwd() {
	return cpwd;
}


public void setCpwd(String cpwd) {
	this.cpwd = cpwd;
}



public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
