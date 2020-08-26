package kr.ac.syu.crawler.ConvenientFacilities;

import kr.ac.syu.core.crawler.URLSender;

public class Thesis extends URLSender { // 논문
	@Override
	public String process() {
		return packLink("https://lib.syu.ac.kr/local/html/211");
	}
}
