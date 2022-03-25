package com.sebone.deliveringsmiles.dataobjects;


/*
 * This is DriverAddress class, this class contain all the address details of a drivers
 * 
 * @author Bhanu Singh
 * @date 24/03/2022
 * @class DriverAddress
 */
public class DriverAddress {
	private String street;
	private String state;
	private String city;
	private int pincode;
	private String country;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
