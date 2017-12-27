package com.struts.beans;

import org.apache.struts.action.ActionForm;

public class Student extends ActionForm{
private String name;
private int studentNo;


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getStudentNo() {
	return studentNo;
}
public void setStudentNo(int studentNo) {
	this.studentNo = studentNo;
}
}
