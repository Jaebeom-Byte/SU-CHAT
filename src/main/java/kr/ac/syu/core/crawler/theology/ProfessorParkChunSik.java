package kr.ac.syu.core.crawler.theology;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorParkChunSik extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/theology/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[5]/div/div[1]");
	}
}