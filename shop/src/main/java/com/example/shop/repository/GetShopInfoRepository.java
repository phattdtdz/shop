package com.example.shop.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shop.entity.ShopInfo;

@Repository
@Transactional
public interface GetShopInfoRepository extends JpaRepository<ShopInfo, Integer>{
}
