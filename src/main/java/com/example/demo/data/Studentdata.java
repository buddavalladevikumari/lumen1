package com.example.demo.data;

public class Studentdata {
	
	private int id;
	private String name;
	private int phonenumber;
	@Override
	public String toString() {
		return "Studentdata [id=" + id + ", name=" + name + ", phonenumber=" + phonenumber + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Studentdata(int id, String name, int phonenumber) {
		super();
		this.id = id;
		this.name = name;
		this.phonenumber = phonenumber;
	}
	public Studentdata() {
		super();
		// TODO Auto-generated constructor stub
	}

}
