package kr.ac.syu.core.crawler.dept.architecture;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorJeongGwangHo extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/arch/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[6]/div/div[1]");
	}
}
