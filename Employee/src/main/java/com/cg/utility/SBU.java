package com.cg.utility;

import java.util.List;

public class SBU {
 private String sbuName;
 private String sbuHead;
 private int sbuId;
 private List<Employee> empList;
public String getSbuName() {
	return sbuName;
}
public void setSbuName(String sbuName) {
	this.sbuName = sbuName;
}
public String getSbuHead() {
	return sbuHead;
}
public void setSbuHead(String sbuHead) {
	this.sbuHead = sbuHead;
}
public int getSbuId() {
	return sbuId;
}
public void setSbuId(int sbuId) {
	this.sbuId = sbuId;
}
public List<Employee> getEmpList() {
	return empList;
}
public void setEmpList(List<Employee> empList) {
	this.empList = empList;
}
@Override
public String toString() {
	return "SBU [sbuName=" + sbuName + ", sbuHead=" + sbuHead + ", sbuId="
			+ sbuId + "]";
}

 
}
