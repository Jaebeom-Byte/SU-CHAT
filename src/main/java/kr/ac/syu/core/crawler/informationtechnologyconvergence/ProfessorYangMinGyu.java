package kr.ac.syu.core.crawler.informationtechnologyconvergence;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorYangMinGyu extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/itce/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[2]/div/div[1]");
	}
}