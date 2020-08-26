package kr.ac.syu.crawler.ConvenientFacilities;

import kr.ac.syu.core.crawler.URLSender;

public class Store extends URLSender { //편의점
	@Override
	public String process() {
		return linkPass("https://www.syu.ac.kr/school-life/facility-information/in-store/");
	}
}
