package kr.ac.syu.crawler.homepage;

import kr.ac.syu.core.crawler.URLSender;

public class GlobalKorean extends URLSender {
	@Override
	public String process() { // 글로벌 한국
		return packLink("https://www.syu.ac.kr/gks/");
	}
}
