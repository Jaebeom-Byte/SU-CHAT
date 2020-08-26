package kr.ac.syu.crawler.ConvenientFacilities;

import kr.ac.syu.core.crawler.URLSender;

public class BookSearch extends URLSender { //도서
	@Override
	public String process() {
		return packLink("https://lib.syu.ac.kr/searchA/coz");
	}
}
