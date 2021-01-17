package com.demo.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.bean.Auction;

@Repository
public class AuctionDaoImpl implements AuctionDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Auction> getAllAuctionDetails() {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		List<Auction> auctionList = session.createQuery("from Auction a").getResultList();
		transaction.commit();
		session.close();
		return auctionList;
		//return null;
	}

}
