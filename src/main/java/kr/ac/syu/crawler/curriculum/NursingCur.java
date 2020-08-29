package kr.ac.syu.crawler.curriculum;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class NursingCur extends CaptureCrawler { //약학
	@Override
	public String process() {
		String realImagePath = null;
		try {
			realImagePath = crawImage(
					"https://www.syu.ac.kr/nursing/curriculum/department/curriculum/single-major-in-nursing/",
					"//*[@id=\"post-1237\"]/div[1]");
			initCrawler();
			realImagePath += "|" + crawImage("https://www.syu.ac.kr/nursing/curriculum/rn-bsn/curriculum/",
					"//*[@id=\"post-846\"]/div[1]");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return realImagePath;
	}
}