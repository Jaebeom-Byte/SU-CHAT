package kr.ac.syu.core.crawler.english;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorShinHanNa extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/english/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[5]/div/div[1]");
	}
}