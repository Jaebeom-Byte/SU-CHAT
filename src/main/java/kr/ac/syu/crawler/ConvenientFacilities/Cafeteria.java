package kr.ac.syu.crawler.ConvenientFacilities;

import kr.ac.syu.core.crawler.URLSender;

public class Cafeteria extends URLSender { //식당
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/school-life/facility-information/our-bank/");
	}
}
