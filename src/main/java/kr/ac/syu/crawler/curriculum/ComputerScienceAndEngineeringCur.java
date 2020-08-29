package kr.ac.syu.crawler.curriculum;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ComputerScienceAndEngineeringCur extends CaptureCrawler { // 컴퓨터 메카트로닉스
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/cse/curriculum/curriculum/",
				/*
				"//*[@id=\"post-219\"]/div[1]/div[1]",
				"//*[@id=\"post-219\"]/div[1]/div[2]",
				"//*[@id=\"post-219\"]/div[1]/div[3]",
				"//*[@id=\"post-219\"]/div[1]/div[4]"
				*/
				"//*[@id=\"post-219\"]/div[1]");
	}
}
