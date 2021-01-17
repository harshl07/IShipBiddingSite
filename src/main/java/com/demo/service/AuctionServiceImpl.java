package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.Auction;
import com.demo.dao.AuctionDao;

@Service
public class AuctionServiceImpl implements AuctionService{
	
	@Autowired
	AuctionDao auctionDao;

	@Override
	public List<Auction> getAllAuctions() {
		
		return auctionDao.getAllAuctionDetails();
	}
	
	
	
}
