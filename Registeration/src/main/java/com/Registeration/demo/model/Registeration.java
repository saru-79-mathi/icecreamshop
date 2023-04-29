package com.Registeration.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Registeration {

	@Id
	private String Firstname;
	private String Lastname;
	private String Email;
	private String Password;
	private String Address;
	private String Country;
	private int Pincode;
	private String Gender;
	private int Itemno;
	private String iteamname;
	private String iteamflavour;
	private int iteamcost;
	private String iteamcolour;
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getItemno() {
		return Itemno;
	}
	public void setItemno(int itemno) {
		Itemno = itemno;
	}
	public String getIteamname() {
		return iteamname;
	}
	public void setIteamname(String iteamname) {
		this.iteamname = iteamname;
	}
	public String getIteamflavour() {
		return iteamflavour;
	}
	public void setIteamflavour(String iteamflavour) {
		this.iteamflavour = iteamflavour;
	}
	public int getIteamcost() {
		return iteamcost;
	}
	public void setIteamcost(int iteamcost) {
		this.iteamcost = iteamcost;
	}
	public String getIteamcolour() {
		return iteamcolour;
	}
	public void setIteamcolour(String iteamcolour) {
		this.iteamcolour = iteamcolour;
	}
	
	
	
	
}
