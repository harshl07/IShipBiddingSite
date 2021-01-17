package com.demo.service;



import com.demo.bean.ShippingLoad;

public interface ShippingLoadService {

	void addShippingLaod(ShippingLoad shippingLoad);

	ShippingLoad getLoadDetails(int shippingLoadID);

}
