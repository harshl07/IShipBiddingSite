package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.bean.Auction;
import com.demo.service.AuctionService;

@Controller
public class AuctionController {
	
	@Autowired
	AuctionService auctionService;
	
	@RequestMapping("/viewAuctions")
	public ModelAndView displayAllAuctions()
	{
		List<Auction> auctionList = auctionService.getAllAuctions();
	//	auctionList.forEach(System.out::println);
		
		for(Auction a:auctionList)
		{
			System.out.println(a.getAuctionID());
		}
		return new ModelAndView("displayAuction","auctionList",auctionList);
	}
	
}
