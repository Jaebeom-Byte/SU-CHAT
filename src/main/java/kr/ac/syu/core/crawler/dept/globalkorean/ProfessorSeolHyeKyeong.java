package kr.ac.syu.core.crawler.dept.globalkorean;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorSeolHyeKyeong extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/gks/professor/", "//*[@id=\"post-2307\"]/div[2]/ul/li[2]/div/div[1]");
	}
}