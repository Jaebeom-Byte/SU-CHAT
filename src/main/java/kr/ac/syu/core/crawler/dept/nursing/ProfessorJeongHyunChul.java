package kr.ac.syu.core.crawler.dept.nursing;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorJeongHyunChul extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/nursing/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[6]/div/div[1]");
	}
}