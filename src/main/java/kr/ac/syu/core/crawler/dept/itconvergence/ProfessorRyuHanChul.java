package kr.ac.syu.core.crawler.dept.itconvergence;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorRyuHanChul extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/itce/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[1]/div/div[1]");
	}
}