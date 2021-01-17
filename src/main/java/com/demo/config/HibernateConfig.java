package com.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.demo.bean.Auction;
import com.demo.bean.Bid;
import com.demo.bean.Customer;
import com.demo.bean.Item;
import com.demo.bean.Shipper;
import com.demo.bean.ShippingLoad;
import com.demo.bean.User;

@Configuration
@EnableTransactionManagement
public class HibernateConfig {

	
	@Autowired
	private ApplicationContext context;
	
	   @Bean
	   public LocalSessionFactoryBean getSessionFactory() {
	       LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
	       factoryBean.setConfigLocation(context.getResource("classpath:hibernate.cfg.xml"));
	       factoryBean.setAnnotatedClasses(Auction.class);
	       factoryBean.setAnnotatedClasses(User.class);
	       factoryBean.setAnnotatedClasses(Customer.class);
	       factoryBean.setAnnotatedClasses(Shipper.class);
	       factoryBean.setAnnotatedClasses(ShippingLoad.class);
	       factoryBean.setAnnotatedClasses(Item.class);
	       factoryBean.setAnnotatedClasses(Bid.class);

	       return factoryBean;
	   }

	   @Bean
	   public HibernateTransactionManager getTransactionManager() {
	       HibernateTransactionManager transactionManager = new HibernateTransactionManager();
	       transactionManager.setSessionFactory(getSessionFactory().getObject());
	       return transactionManager;
	   }

}
