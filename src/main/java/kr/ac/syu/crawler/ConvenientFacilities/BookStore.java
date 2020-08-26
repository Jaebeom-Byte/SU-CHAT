package kr.ac.syu.crawler.ConvenientFacilities;

import kr.ac.syu.core.crawler.URLSender;

public class BookStore extends URLSender { //서점
	@Override
	public String process() {
		return linkPass("https://www.syu.ac.kr/school-life/facility-information/bookstore/");
	}
}
