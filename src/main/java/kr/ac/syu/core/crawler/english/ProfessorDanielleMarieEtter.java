package kr.ac.syu.core.crawler.english;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorDanielleMarieEtter extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/english/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[7]/div/div[1]");
	}
}