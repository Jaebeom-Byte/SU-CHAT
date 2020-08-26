package kr.ac.syu.crawler.curriculum;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ChemistyLifeScienceCur extends CaptureCrawler {
	@Override
	public String process() { // 화학생명공학
		return crawImage("https://www.syu.ac.kr/chem/curriculum/curriculum/",
				"//*[@id=\"post-48\"]/div[1]/div[1]",
				"//*[@id=\"post-48\"]/div[1]/div[2]",
				"//*[@id=\"post-48\"]/div[1]/div[3]",
				"//*[@id=\"post-48\"]/div[1]/div[4]",
				"//*[@id=\"post-48\"]/div[1]/div[5]",
				"//*[@id=\"post-48\"]/div[1]/div[6]",
				"//*[@id=\"post-48\"]/div[1]/div[7]",
				"//*[@id=\"post-48\"]/div[1]/div[8]");
	}
}
