package com.lms.structure;

public class Student {
private int id;
private String sname;
private int sage;
private int sclass;
public int getid() {
	return id;
}
public void setid(int id) {
	this.id = id;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getSage() {
	return sage;
}
public void setSage(int sage) {
	this.sage = sage;
}
public int getSclass() {
	return sclass;
}
public void setSclass(int sclass) {
	this.sclass = sclass;
}
@Override
public String toString() {
	return "Student [id=" + id + ", sname=" + sname + ", sage=" + sage + ", sclass=" + sclass + "]";
}

}
