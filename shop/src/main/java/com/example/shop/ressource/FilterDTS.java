package com.example.shop.ressource;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilterDTS {

	private Set<String> categoryProduct;
	private Set<String> locationShop;
	private Set<Integer> status;
	
}
