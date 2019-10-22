package com.demo;
import java.time.LocalDate;
public class Tablet implements Comparable<Tablet> {
	private String name;
	public Tablet(String name, LocalDate expiryDate) {
		super();
		this.name = name;
		this.expiryDate = expiryDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	private LocalDate expiryDate;
	@Override
	public int compareTo(Tablet o) {
		// TODO Auto-generated method stub
		return this.expiryDate.compareTo(o.expiryDate);
	}

}
