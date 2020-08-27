package kr.ac.syu.core.crawler.dept.nursing;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorKimJiHyeon extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/nursing/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[8]/div/div[1]");
	}
}