package com.example.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.shop.entity.ShopInfo;
import com.example.shop.repository.GetShopInfoRepository;

@Service
public class LoadShopDataService {

@Autowired
GetShopInfoRepository getShopInfoRepository;

public Page<ShopInfo> getDataShopInfo( int page, int size){
	
	return getShopInfoRepository.findAll(PageRequest.of(page,size	));

}


public List<ShopInfo> getDataShop(){
	return getShopInfoRepository.findAll();
}
}
