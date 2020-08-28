package kr.ac.syu.core.crawler.dept.computermechatronics;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorKimHyeonKyu extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/comp/faculty/professor/", "//*[@id=\"post-237\"]/div[2]/ul/li[1]/div/div[1]");
	}
}