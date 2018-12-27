package com.kkb.learn.huikemall.search;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kkb.learn.huikemall.pojo.GoodsInfo;
import com.kkb.learn.huikemall.pojo.SearchInfo;

@Controller
@RequestMapping("/search")
public class SearchController {
	
	@Reference
	private IGoodsService goodsService;
	
	@RequestMapping("/searchGoods.do")
	@ResponseBody
	public List<GoodsInfo> searchGoods() {
		SearchInfo searchInfo = new SearchInfo();
		return goodsService.searchGoodsInfo(searchInfo);
	}
	
}
