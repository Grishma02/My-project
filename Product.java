package com.fashionista.Model;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	int pid;
	@Column
	String pname;

@Column
String brand;

@Column
String avail;


@Column
String pprice;



@Column
String pdesc;


public String getpname() {
	return pname;
}
public void setpname(String pname) {
	this.pname = pname;
}

public int getpid(){
	return pid;
}
public void setpid(int pid){
this.pid= pid;
}

public String getbrand() {
	return brand;
}

public void setbrand(String brand) {
	this.brand = brand;
}

public String getavail() {
	return avail;
}
public void setavail(String avail) {
	this.avail= avail;
}


public String getpprice() {
	return pprice;
}


public void setpprice(String pprice) {
	this.pprice = pprice;
}





public String getpdesc() {
	return pdesc;
}
public void setpdesc(String pdesc) {
	this.pdesc = pdesc;
}

}



