package kr.ac.syu.core.crawler.dept.artanddesign;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorKimYoungAn extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/arts/faculty/professor/", "//*[@id=\"post-237\"]/div[2]/ul/li[4]/div/div[1]");
	}
}