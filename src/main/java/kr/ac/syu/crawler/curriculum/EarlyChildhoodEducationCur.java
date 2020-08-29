package kr.ac.syu.crawler.curriculum;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class EarlyChildhoodEducationCur extends CaptureCrawler { // 유아교육
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/ece/curriculum/curriculum/year-of-admission-2020/",
				/*
				"//*[@id=\"post-4459\"]/div[1]/div[1]/div[2]",
				"//*[@id=\"post-4459\"]/div[1]/div[1]/div[3]",
				"//*[@id=\"post-4459\"]/div[1]/div[2]/div[1]",
				"//*[@id=\"post-4459\"]/div[1]/div[2]/div[2]",
				"//*[@id=\"post-4459\"]/div[1]/div[3]/div[1]",
				"//*[@id=\"post-4459\"]/div[1]/div[3]/div[2]",
				"//*[@id=\"post-4459\"]/div[1]/div[4]/div[1]",
				"//*[@id=\"post-4459\"]/div[1]/div[4]/div[2]"
				*/
				"//*[@id=\"post-4459\"]/div[1]");
	}
}
