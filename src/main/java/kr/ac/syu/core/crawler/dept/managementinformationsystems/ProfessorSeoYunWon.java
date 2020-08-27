package kr.ac.syu.core.crawler.dept.managementinformationsystems;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorSeoYunWon extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/manage/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[4]/div/div[1]");
	}
}