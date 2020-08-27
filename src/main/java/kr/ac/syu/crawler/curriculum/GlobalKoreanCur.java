package kr.ac.syu.crawler.curriculum;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class GlobalKoreanCur extends CaptureCrawler {
	@Override
	public String process() { // 글로벌 한국
		return crawImage("https://www.syu.ac.kr/gks/curriculum/curriculum-2018/",
				"//*[@id=\"post-2385\"]/div/table[1]",
				"//*[@id=\"post-2385\"]/div/table[2]",
				"//*[@id=\"post-2385\"]/div/table[3]",
				"//*[@id=\"post-2385\"]/div/table[4]");
	}
}
