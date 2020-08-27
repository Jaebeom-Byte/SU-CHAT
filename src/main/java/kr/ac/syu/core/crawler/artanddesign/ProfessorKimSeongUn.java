package kr.ac.syu.core.crawler.artanddesign;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorKimSeongUn extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/arts/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[3]/div/div[1]");
	}
}
