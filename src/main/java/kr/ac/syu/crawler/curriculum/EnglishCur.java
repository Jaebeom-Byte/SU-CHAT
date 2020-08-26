package kr.ac.syu.crawler.curriculum;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class EnglishCur extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/english/curriculum/curriculum/english-language-and-literature-course/",
				"//*[@id=\"post-2335\"]/div[1]/div[2]",
				"//*[@id=\"post-2335\"]/div[1]/div[3]",
				"//*[@id=\"post-2335\"]/div[1]/div[4]",
				"//*[@id=\"post-2335\"]/div[1]/div[5]",
				"//*[@id=\"post-2335\"]/div[1]/div[6]",
				"//*[@id=\"post-2335\"]/div[1]/div[7]",
				"//*[@id=\"post-2335\"]/div[1]/div[8]",
				"//*[@id=\"post-2335\"]/div[1]/div[9]");
	}
}
