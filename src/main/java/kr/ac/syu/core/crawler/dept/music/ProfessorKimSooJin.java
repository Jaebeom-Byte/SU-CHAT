package kr.ac.syu.core.crawler.dept.music;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorKimSooJin extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/music/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[8]/div/div[1]");
	}
}