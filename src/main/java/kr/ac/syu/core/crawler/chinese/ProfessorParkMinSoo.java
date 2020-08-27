package kr.ac.syu.core.crawler.chinese;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorParkMinSoo extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/chinese/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[2]/div/div[1]");
	}
}