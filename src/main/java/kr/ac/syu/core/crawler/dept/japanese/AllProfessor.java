package kr.ac.syu.core.crawler.dept.japanese;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class AllProfessor extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/japanese/faculty/professor",
				"//*[@id=\"post-54\"]/div[2]/ul/li[1]/div/div[1]",
				"//*[@id=\"post-54\"]/div[2]/ul/li[2]/div/div[1]",
				"//*[@id=\"post-54\"]/div[2]/ul/li[3]/div/div[1]"
		);
	}
}
