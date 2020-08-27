package kr.ac.syu.core.crawler.physicaltherapy;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorSongChangHo extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/pt/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[3]/div/div[1]");
	}
}