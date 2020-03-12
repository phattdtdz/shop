package com.example.shop.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.shop.entity.ShopInfo;
import com.example.shop.ressource.FilterDTS;
import com.example.shop.service.LoadShopDataService;

@CrossOrigin(origins = "/**", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class ShopController {
	@Autowired
	LoadShopDataService loadShopDataService;
	
//    @GetMapping("/shop")
//    public String showListCheckin(Model model , @RequestParam("page") Optional<Integer> page	, @RequestParam("size") Optional<Integer> size) {
//    	  int currentPage = page.orElse(1);
//          int pageSize = size.orElse(3);
//    	model.addAttribute("data",loadShopDataService.getDataShopInfo(currentPage -1,pageSize));
//    	return "shop.html";
//    }
	
//	@CrossOrigin
    @GetMapping("/shoplist")
    public Page <ShopInfo> showListShops( @RequestParam("page") Optional<Integer> page	, @RequestParam("size") Optional<Integer> size	) {
    	  int currentPage = page.orElse(1);
          int pageSize = size.orElse(3);
    	return  loadShopDataService.getDataShopInfo(currentPage-1,pageSize);
  }
   
    @GetMapping("/filter")
    public FilterDTS getFilter()
    {
    	Set <String> cate = new HashSet <String>();
    	Set <String> loc = new HashSet <String>();
    	Set <Integer> status = new HashSet<Integer>();
    	List <ShopInfo> temps = loadShopDataService.getDataShop();
    	temps.forEach(temp ->{
    		cate.add(temp.getCategory());
    		loc.add(temp.getLocation());
    		status.add(temp.getStatus());
    	});
    	return new FilterDTS(cate,loc,status);
    }
    
    
    
    
//    @GetMapping( value = {"index" , "/"})
//    public String getHomepage() {
//    	return "index.html";
//    }
}