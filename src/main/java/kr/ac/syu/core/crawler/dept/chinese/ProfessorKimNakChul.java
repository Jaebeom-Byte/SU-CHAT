package kr.ac.syu.core.crawler.dept.chinese;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorKimNakChul extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/chinese/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[1]/div/div[1]");
	}
}