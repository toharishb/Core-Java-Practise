package com.demo;

public class Student {
private String names;
private int percentage;

public Student(String names, int percentage) {
	super();
	this.names = names;
	this.percentage = percentage;
}
public String getNames() {
	return names;
}
public void setNames(String names) {
	this.names = names;
}
public int getPercentage() {
	return percentage;
}
public void setPercentage(int percentage) {
	this.percentage = percentage;
}

}
