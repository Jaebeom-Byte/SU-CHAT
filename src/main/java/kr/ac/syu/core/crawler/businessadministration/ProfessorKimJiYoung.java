package kr.ac.syu.core.crawler.businessadministration;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorKimJiYoung extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/doba/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[8]/div/div[1]");
	}
}
