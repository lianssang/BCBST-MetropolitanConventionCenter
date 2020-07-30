package com.training.metro;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.sun.istack.NotNull;



@Entity
public class Customer {
	@Id
	@NotNull
	long id;
	@NotNull
	String first_name;
	@NotNull
	String last_name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public Customer(long id, String first_name, String last_name) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
