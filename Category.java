package com.fashionista.Model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	int cid;
	@Column
	String cname;

@Column
String cdesc;



public String getcname() {
	return cname;
}
public void setcname(String cname) {
	this.cname = cname;
}

public int getcid(){
	return cid;
}
public void setcid(int cid){
this.cid= cid;
}

public String getcdesc() {
	return cdesc;
}
public void setcdesc(String cdesc) {
	this.cdesc = cdesc;
}

}




