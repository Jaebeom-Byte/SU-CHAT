package kr.ac.syu.core.crawler.artanddesign;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorJooMiKyeong extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/arts/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[6]/div/div[1]");
	}
}
