package kr.ac.syu.core.crawler.leisureandsports;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorParkJaeIn extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/sports/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[4]/div/div[1]");
	}
}