package kr.ac.syu.core.crawler.dept.theology;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class AllProfessor extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/theology/faculty/professor/",
				"//*[@id=\"post-54\"]/div[2]/ul/li[1]/div/div[1]",
				"//*[@id=\"post-54\"]/div[2]/ul/li[2]/div/div[1]",
				"//*[@id=\"post-54\"]/div[2]/ul/li[3]/div/div[1]",
				"//*[@id=\"post-54\"]/div[2]/ul/li[4]/div/div[1]",
				"//*[@id=\"post-54\"]/div[2]/ul/li[5]/div/div[1]",
				"//*[@id=\"post-54\"]/div[2]/ul/li[6]/div/div[1]",
				"//*[@id=\"post-54\"]/div[2]/ul/li[7]/div/div[1]",
				"//*[@id=\"post-54\"]/div[2]/ul/li[8]/div/div[1]",
				"//*[@id=\"post-54\"]/div[2]/ul/li[9]/div/div[1]",
				"//*[@id=\"post-54\"]/div[2]/ul/li[10]/div/div[1]",
				"//*[@id=\"post-54\"]/div[2]/ul/li[11]/div/div[1]",
				"//*[@id=\"post-54\"]/div[2]/ul/li[12]/div/div[1]"
		);
	}
}
