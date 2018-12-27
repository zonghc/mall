package com.kkb.learn.huikemall.search;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;
import com.kkb.learn.huikemall.pojo.GoodsInfo;
import com.kkb.learn.huikemall.pojo.SearchInfo;

@Service
public class GoodsServiceImpl implements IGoodsService {

	@Override
	public List<GoodsInfo> searchGoodsInfo(SearchInfo searchInfo) {
		List<GoodsInfo> list = new ArrayList<GoodsInfo>();
		GoodsInfo ga = new GoodsInfo();
		ga.setGoodsName("ga name");
		ga.setPrice(1000);
		GoodsInfo gb = new GoodsInfo();
		gb.setGoodsName("gb name");
		gb.setPrice(2000);
		list.add(ga);
		list.add(gb);
		return list;
	}

}
