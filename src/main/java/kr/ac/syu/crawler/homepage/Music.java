package kr.ac.syu.crawler.homepage;

import kr.ac.syu.core.crawler.URLSender;

public class Music extends URLSender { // 음악
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/music/");
	}
}
