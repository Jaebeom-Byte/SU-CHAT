package kr.ac.syu.core.crawler.dept.managementinformationsystems;

import kr.ac.syu.core.crawler.TextCrawler;

public class AllProfessor extends TextCrawler {
	@Override
	public String process() {
		return crawText("https://www.syu.ac.kr/manage/faculty/professor/",
				"//*[@id=\"post-54\"]/div[2]/ul/li[1]/div/div[1]",
				"//*[@id=\"post-54\"]/div[2]/ul/li[2]/div/div[1]",
				"//*[@id=\"post-54\"]/div[2]/ul/li[3]/div/div[1]",
				"//*[@id=\"post-54\"]/div[2]/ul/li[4]/div/div[1]",
				"//*[@id=\"post-54\"]/div[2]/ul/li[5]/div/div[1]"
		);
	}
}
