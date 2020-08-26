package kr.ac.syu.crawler.homepage;

import kr.ac.syu.core.crawler.URLSender;

public class BusinessAdministration extends URLSender { // 경영
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/doba/");
	}
}
