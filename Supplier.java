package com.fashionista.Model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Supplier {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	int sid;
	@Column
	String sname;

@Column
String sdesc;



public String getsname() {
	return sname;
}
public void setsname(String sname) {
	this.sname = sname;
}

public int getsid(){
	return sid;
}
public void setsid(int sid){
this.sid= sid;
}

public String getsdesc() {
	return sdesc;
}
public void setpdesc(String sdesc) {
	this.sdesc = sdesc;
}

}

