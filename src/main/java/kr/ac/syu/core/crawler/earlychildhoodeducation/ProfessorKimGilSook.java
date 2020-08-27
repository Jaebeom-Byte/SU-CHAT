package kr.ac.syu.core.crawler.earlychildhoodeducation;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorKimGilSook extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/ece/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[6]/div/div[1]");
	}
}