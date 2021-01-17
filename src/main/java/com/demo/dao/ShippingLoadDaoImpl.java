package com.demo.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.bean.ShippingLoad;

@Repository
public class ShippingLoadDaoImpl implements ShippingLoadDao{

	@Autowired
	SessionFactory sessionFactory;
	static Session session; 
	
	public void insertLoad(ShippingLoad shippingLoad) {
		Session session =null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(shippingLoad);
			transaction.commit();
		}catch(Exception e){
			transaction.rollback();
			e.printStackTrace();
			//e.getMessage();
		}finally {
			session.close();
		}
	
	}

	@Override
	public ShippingLoad loadDetails(int shippingLoadID) {
		session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		ShippingLoad shippingLoad = session.get(ShippingLoad.class, shippingLoadID);
		transaction.commit();
		session.close();
		return shippingLoad;
	}



}
