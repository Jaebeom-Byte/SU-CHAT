package kr.ac.syu.crawler.ConvenientFacilities;

import kr.ac.syu.core.crawler.URLSender;

public class PostOffice extends URLSender { //우체국
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/school-life/facility-information/post-office/");
	}
}
