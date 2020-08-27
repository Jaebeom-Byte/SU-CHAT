package kr.ac.syu.core.crawler.environmentaldesignandhorticulture;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorJoChiWoong extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/envdh/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[2]/div/div[1]");
	}
}