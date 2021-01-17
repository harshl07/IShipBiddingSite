package com.demo.bean;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class ShippingLoad {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int shippingLoadID;
	@ManyToOne
	@JoinColumn(name="CustomerID")
	private Customer customer;
	
	@OneToMany(mappedBy = "shippingLoad")
	private List<Item> items = new ArrayList<Item>();
	
	private String description;
	private String street;
	private String city;
	private String state;
	private String pincode;
	
	public ShippingLoad() {
		super();
	}

	public ShippingLoad(int shippingLoadID, Customer customer, List<Item> items, String description, String street,
			String city, String state, String pincode) {
		super();
		this.shippingLoadID = shippingLoadID;
		this.customer = customer;
		this.items = items;
		this.description = description;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	
	public int getShippingLoadID() {
		return shippingLoadID;
	}

	public void setShippingLoadID(int shippingLoadID) {
		this.shippingLoadID = shippingLoadID;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	@Override
	public String toString() {
		return "ShippingLoad [shippingLoadID=" + shippingLoadID + ", customer=" + customer + ", items=" + items
				+ ", description=" + description + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + "]";
	}


	
	
}
