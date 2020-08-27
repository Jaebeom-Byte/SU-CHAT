package kr.ac.syu.core.crawler.dept.foodandnutrition;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorHanKyeongSik extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/fn/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[2]/div/div[1]");
	}
}