package kr.ac.syu.core.crawler.globalkoreanstudies;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorEumYoungChul extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/gks/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[1]/div/div[1]");
	}
}