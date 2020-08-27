package kr.ac.syu.core.crawler.chemistrylifescience;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorKimNamJeong extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/chem/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[3]/div/div[1]");
	}
}
