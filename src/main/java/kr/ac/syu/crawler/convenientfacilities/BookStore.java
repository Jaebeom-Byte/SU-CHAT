package kr.ac.syu.crawler.convenientfacilities;

import kr.ac.syu.core.crawler.URLSender;

public class BookStore extends URLSender { //서점
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/school-life/facility-information/bookstore/");
	}
}
