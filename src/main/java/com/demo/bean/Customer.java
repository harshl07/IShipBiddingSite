package com.demo.bean;


import java.util.ArrayList;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="CustomerID")
public class Customer extends User{
	private String customerName;
	private String emailId;
	private String contactNumber;
	private String street;
	private String city;
	private String state;
	private String pincode;
	
	@OneToMany(mappedBy = "customer")
	List<ShippingLoad> shippingLoads = new ArrayList<ShippingLoad>();
	
	
	public Customer() {
		super();
	}


	public Customer(String customerName, String emailId, String contactNumber, String street, String city, String state,
			String pincode, List<ShippingLoad> shippingLoads) {
		super();
		this.customerName = customerName;
		this.emailId = emailId;
		this.contactNumber = contactNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.shippingLoads = shippingLoads;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


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


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	public List<ShippingLoad> getShippingLoads() {
		return shippingLoads;
	}


	public void setShippingLoads(List<ShippingLoad> shippingLoads) {
		this.shippingLoads = shippingLoads;
	}


	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", emailId=" + emailId + ", contactNumber=" + contactNumber
				+ ", street=" + street + ", city=" + city + ", state=" + state + ", pincode=" + pincode
				+ ", shippingLoads=" + shippingLoads + "]";
	}


	
	
}
