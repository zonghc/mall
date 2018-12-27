package com.kkb.learn.huikemall.search;

import java.util.List;

import com.kkb.learn.huikemall.pojo.GoodsInfo;
import com.kkb.learn.huikemall.pojo.SearchInfo;

public interface IGoodsService {
	
	List<GoodsInfo> searchGoodsInfo(SearchInfo searchInfo);
	
}
