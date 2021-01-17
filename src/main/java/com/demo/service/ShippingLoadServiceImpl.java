package com.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.ShippingLoad;
import com.demo.dao.ShippingLoadDao;

@Service
public class ShippingLoadServiceImpl implements ShippingLoadService{

	@Autowired
	ShippingLoadDao shippingLoadDao;
	
	@Override
	public void addShippingLaod(ShippingLoad shippingLoad) {
		shippingLoadDao.insertLoad(shippingLoad);
		
	}

	
	@Override
	public ShippingLoad getLoadDetails(int shippingLoadID) {
		return shippingLoadDao.loadDetails(shippingLoadID);
	}

}
