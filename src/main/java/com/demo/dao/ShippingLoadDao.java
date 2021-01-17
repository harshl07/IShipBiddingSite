package com.demo.dao;



import com.demo.bean.ShippingLoad;

public interface ShippingLoadDao {

	void insertLoad(ShippingLoad shippingLoad);

	ShippingLoad loadDetails(int shippingLoadID);

}
