package kr.ac.syu.core.crawler.dept.computerscience;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorKimHeeWan extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/cse/faculty/professor/", "//*[@id=\"post-237\"]/div[2]/ul/li[6]/div/div[1]");
	}
}
