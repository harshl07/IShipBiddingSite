package com.demo.bean;


import java.time.LocalDateTime;
import java.util.ArrayList;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


import org.hibernate.annotations.CreationTimestamp;


@Entity
public class Auction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int auctionID;
	
//	@Temporal(TemporalType.DATE)
//	private Date start_date;
//	@Temporal(TemporalType.DATE)
//	private Date end_date;
	
	@CreationTimestamp
    private LocalDateTime startDate;
 
	@CreationTimestamp
    private LocalDateTime endDate;
	
	private double winningBid; 
	
	@ManyToOne
	@JoinColumn(name="ShipperID")
	private Shipper shipper;
	
	@OneToOne
	@JoinColumn(name="ShippingLoadID")
	private ShippingLoad shippingLoad ;
	
	@OneToMany(mappedBy = "auction")
	private List<Bid> bids = new ArrayList<Bid>();
	
	private boolean status;
	
	public Auction() {
		super();
	}

	public Auction(int auctionID, LocalDateTime startDate, LocalDateTime endDate, double winningBid, Shipper shipper,
			ShippingLoad shippingLoad, List<Bid> bids, boolean status) {
		super();
		this.auctionID = auctionID;
		this.startDate = startDate;
		this.endDate = endDate;
		this.winningBid = winningBid;
		this.shipper = shipper;
		this.shippingLoad = shippingLoad;
		this.bids = bids;
		this.status = status;
	}

	public int getAuctionID() {
		return auctionID;
	}

	public void setAuctionID(int auctionID) {
		this.auctionID = auctionID;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public double getWinningBid() {
		return winningBid;
	}

	public void setWinningBid(double winningBid) {
		this.winningBid = winningBid;
	}

	public Shipper getShipper() {
		return shipper;
	}

	public void setShipper(Shipper shipper) {
		this.shipper = shipper;
	}

	public ShippingLoad getShippingLoad() {
		return shippingLoad;
	}

	public void setShippingLoad(ShippingLoad shippingLoad) {
		this.shippingLoad = shippingLoad;
	}

	public List<Bid> getBids() {
		return bids;
	}

	public void setBids(List<Bid> bids) {
		this.bids = bids;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Auction [auctionID=" + auctionID + ", startDate=" + startDate + ", endDate=" + endDate + ", winningBid="
				+ winningBid + ", shipper=" + shipper + ", shippingLoad=" + shippingLoad + ", bids=" + bids
				+ ", status=" + status + "]";
	}

	
	
	
}
