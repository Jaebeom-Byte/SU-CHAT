package kr.ac.syu.crawler.homepage;

import kr.ac.syu.core.crawler.URLSender;

public class LeisureAndSports extends URLSender { // 생활체육
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/sports/");
	}
}
