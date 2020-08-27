package kr.ac.syu.core.crawler.dept.globalkorean;

import kr.ac.syu.core.crawler.TextCrawler;

public class AllProfessor extends TextCrawler {
	@Override
	public String process() {
		return crawText("https://www.syu.ac.kr/gks/faculty/professor/",
				"//*[@id=\"post-54\"]/div[2]/ul/li[1]/div/div[1]",
				"//*[@id=\"post-54\"]/div[2]/ul/li[2]/div/div[1]"
		);
	}
}
