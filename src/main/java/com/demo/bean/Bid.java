package com.demo.bean;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;



@Entity
public class Bid {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int bidID;
	@ManyToOne
	@JoinColumn(name="ShipperID")
	private Shipper shipper;
	
	@ManyToOne
	@JoinColumn(name="auctionID")
	private Auction auction;
	
	private double price;
	
//	@Temporal(TemporalType.TIMESTAMP)
//	private Date timestamp;
	
	@CreationTimestamp
    private LocalDateTime timestamp;

	public Bid() {
		super();
	}

	public Bid(int bidID, Shipper shipper, Auction auction, double price, LocalDateTime timestamp) {
		super();
		this.bidID = bidID;
		this.shipper = shipper;
		this.auction = auction;
		this.price = price;
		this.timestamp = timestamp;
	}

	public int getBid_id() {
		return bidID;
	}

	public void setBid_id(int bidID) {
		this.bidID = bidID;
	}

	public Shipper getShipper() {
		return shipper;
	}

	public void setShipper(Shipper shipper) {
		this.shipper = shipper;
	}

	public Auction getAuction() {
		return auction;
	}

	public void setAuction(Auction auction) {
		this.auction = auction;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "Bid [bidID=" + bidID + ", shipper=" + shipper + ", auction=" + auction + ", price=" + price
				+ ", timestamp=" + timestamp + "]";
	}

	
	
}
