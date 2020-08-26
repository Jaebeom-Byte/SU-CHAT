package kr.ac.syu.crawler.ConvenientFacilities;

import kr.ac.syu.core.crawler.URLSender;

public class Salon extends URLSender { // 미용실
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/school-life/facility-information/salon/");
	}
}
