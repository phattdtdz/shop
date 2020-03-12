package com.example.shop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "shop_info")
public class ShopInfo {
	
	@Id
	@Column (name = "id")
	private int id;
	@Column (name ="picture")
	private String picture;
	@Column (name = "name")
	private String name;
	@Column (name ="location")
	private String location;
	@Column (name = "category")
	private String category;
	@Column (name = "post_product")
	private int postProduct;
	@Column (name = "pending_product")
	private int pendingProduct;
	@Column (name = "status")
	private int status;
	@Column (name = "date")
	private Long date;

	
}
