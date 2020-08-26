package kr.ac.syu.crawler.convenientfacilities;

import kr.ac.syu.core.crawler.URLSender;

public class HairShop extends URLSender { // 미용실
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/school-life/facility-information/salon/");
	}
}
