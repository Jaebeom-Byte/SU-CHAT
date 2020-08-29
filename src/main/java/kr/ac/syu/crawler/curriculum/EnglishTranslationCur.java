package kr.ac.syu.crawler.curriculum;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class EnglishTranslationCur extends CaptureCrawler { //영어 통번역
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/english/curriculum/curriculum/english-translation-and-interpretation/",
				/*
				"//*[@id=\"post-2337\"]/div[1]/div[2]",
				"//*[@id=\"post-2337\"]/div[1]/div[3]",
				"//*[@id=\"post-2337\"]/div[1]/div[4]",
				"//*[@id=\"post-2337\"]/div[1]/div[5]",
				"//*[@id=\"post-2337\"]/div[1]/div[6]",
				"//*[@id=\"post-2337\"]/div[1]/div[7]",
				"//*[@id=\"post-2337\"]/div[1]/div[8]"
				*/
				"//*[@id=\"post-2337\"]/div[1]");
	}
}
