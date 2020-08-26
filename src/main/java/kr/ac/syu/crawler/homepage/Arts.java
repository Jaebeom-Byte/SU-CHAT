package kr.ac.syu.crawler.homepage;

import kr.ac.syu.core.crawler.URLSender;

public class Arts extends URLSender { // 아트앤디자인
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/arts/");
	}
}
