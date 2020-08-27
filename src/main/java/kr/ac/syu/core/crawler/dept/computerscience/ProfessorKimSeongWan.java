package kr.ac.syu.core.crawler.dept.computerscience;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorKimSeongWan extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/cse/faculty/professor/", "//*[@id=\"post-237\"]/div[2]/ul/li[2]/div/div[1]");
	}
}
