package com.demo.bean;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="ShipperID")
public class Shipper extends User{

	private String shipperName;
	private String emailId;
	private String contactNumber;
	private String vehicalRegistrationNumber;
	private String vehicalType;
	private String vehicalPhoto;
	private String street;
	private String city;
	private String state;
	private String pincode;
	
	@OneToMany(mappedBy = "shipper")
	private List<Bid> bidList = new ArrayList<Bid>();
	
	@OneToMany(mappedBy = "shipper")
	private List<Auction> auctionList = new ArrayList<Auction>();
	
	
	
	public Shipper() {
		super();
	}

	public Shipper(String shipperName, String emailId, String contactNumber, String vehicalRegistrationNumber,
			String vehicalType, String vehicalPhoto, List<Bid> bidList, List<Auction> auctionList, String street,
			String city, String state, String pincode) {
		super();
		this.shipperName = shipperName;
		this.emailId = emailId;
		this.contactNumber = contactNumber;
		this.vehicalRegistrationNumber = vehicalRegistrationNumber;
		this.vehicalType = vehicalType;
		this.vehicalPhoto = vehicalPhoto;
		this.bidList = bidList;
		this.auctionList = auctionList;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public String getShipperName() {
		return shipperName;
	}

	public void setShipperName(String shipperName) {
		this.shipperName = shipperName;
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

	public String getVehicalRegistrationNumber() {
		return vehicalRegistrationNumber;
	}

	public void setVehicalRegistrationNumber(String vehicalRegistrationNumber) {
		this.vehicalRegistrationNumber = vehicalRegistrationNumber;
	}

	public String getVehicalType() {
		return vehicalType;
	}

	public void setVehicalType(String vehicalType) {
		this.vehicalType = vehicalType;
	}

	public String getVehicalPhoto() {
		return vehicalPhoto;
	}

	public void setVehicalPhoto(String vehicalPhoto) {
		this.vehicalPhoto = vehicalPhoto;
	}

	public List<Bid> getBidList() {
		return bidList;
	}

	public void setBidList(List<Bid> bidList) {
		this.bidList = bidList;
	}

	public List<Auction> getAuctionList() {
		return auctionList;
	}

	public void setAuctionList(List<Auction> auctionList) {
		this.auctionList = auctionList;
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
		return "Shipper [shipperName=" + shipperName + ", emailId=" + emailId + ", contactNumber=" + contactNumber
				+ ", vehicalRegistrationNumber=" + vehicalRegistrationNumber + ", vehicalType=" + vehicalType
				+ ", vehicalPhoto=" + vehicalPhoto + ", bidList=" + bidList + ", auctionList=" + auctionList
				+ ", street=" + street + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}

	
	
	
	 
}
