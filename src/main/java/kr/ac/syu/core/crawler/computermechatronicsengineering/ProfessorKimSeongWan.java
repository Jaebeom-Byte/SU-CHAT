package kr.ac.syu.core.crawler.computermechatronicsengineering;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorKimSeongWan extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/comp/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[2]/div/div[1]");
	}
}
