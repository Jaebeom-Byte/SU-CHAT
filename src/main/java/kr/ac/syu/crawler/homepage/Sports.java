package kr.ac.syu.crawler.homepage;

import kr.ac.syu.core.crawler.URLSender;

public class Sports extends URLSender { // 생활체육
	@Override
	public String process() {
		return linkPass("https://www.syu.ac.kr/sports/");
	}
}
