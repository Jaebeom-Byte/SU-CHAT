package kr.ac.syu.core.crawler.dept.computerscience;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ComputerProfessorKoJangHyuk extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/cse/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[8]/div/div[1]");
	}
}
