package kr.ac.syu.core.crawler.music;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorLimBongSoon extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/music/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[4]/div/div[1]");
	}
}