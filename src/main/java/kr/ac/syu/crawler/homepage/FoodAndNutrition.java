package kr.ac.syu.crawler.homepage;

import kr.ac.syu.core.crawler.URLSender;

public class FoodAndNutrition extends URLSender { // 식품 영양
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/fn/");
	}
}
