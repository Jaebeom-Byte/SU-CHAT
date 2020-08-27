package kr.ac.syu.core.crawler.businessadministration;

import kr.ac.syu.core.crawler.TextCrawler;

public class AllProfessor extends TextCrawler {
	@Override
	public String process() {
		return crawText("https://www.syu.ac.kr/doba/faculty/professor/",
				"//*[@id=\"post-54\"]/div[2]/ul/li[1]/div/div[1]",
				"//*[@id=\"post-54\"]/div[2]/ul/li[2]/div/div[1]",
				"//*[@id=\"post-54\"]/div[2]/ul/li[3]/div/div[1]",
				"//*[@id=\"post-54\"]/div[2]/ul/li[4]/div/div[1]",
				"//*[@id=\"post-54\"]/div[2]/ul/li[5]/div/div[1]",
				"//*[@id=\"post-54\"]/div[2]/ul/li[6]/div/div[1]",
				"//*[@id=\"post-54\"]/div[2]/ul/li[7]/div/div[1]",
				"//*[@id=\"post-54\"]/div[2]/ul/li[8]/div/div[1]"
		);
	}
}
