package com.kkb.learn.huikemall.pojo;

import java.io.Serializable;

public class GoodsInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private String goodsName;
	private int price;
	
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
