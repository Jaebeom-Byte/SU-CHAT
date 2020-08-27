package kr.ac.syu.core.crawler.architecture;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorLeeGyuIl extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/cse/faculty/professor/", "//*[@id=\"post-237\"]/div[2]/ul/li[1]/div/div[1]");
	}
}