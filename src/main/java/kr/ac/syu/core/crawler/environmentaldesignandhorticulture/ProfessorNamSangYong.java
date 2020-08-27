package kr.ac.syu.core.crawler.environmentaldesignandhorticulture;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorNamSangYong extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/envdh/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[3]/div/div[1]");
	}
}