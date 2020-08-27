package kr.ac.syu.core.crawler.earlychildhoodeducation;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorChoiSuDong extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/ece/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[3]/div/div[1]");
	}
}