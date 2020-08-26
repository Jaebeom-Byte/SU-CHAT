package kr.ac.syu.crawler.ConvenientFacilities;

import kr.ac.syu.core.crawler.URLSender;

public class Suwings extends URLSender { //suwings연결
	@Override
	public String process() {
		return packLink("https://suwings.syu.ac.kr/sso/login.jsp");
	}
}
