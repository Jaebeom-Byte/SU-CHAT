package kr.ac.syu.crawler.curriculum;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class LiberalArtsCur extends CaptureCrawler {
	@Override
	public String process() {
		String realImagePath = null;
		try {
			realImagePath = crawImage("https://www.syu.ac.kr/teacher/course-guide/basic-policy/completed/",
					"//*[@id=\"post-2747\"]/div");
			initCrawler();
			realImagePath += "|"
					+ crawImage("https://www.syu.ac.kr/teacher/course-guide/basic-policy/cultural-essentials/",
							"//*[@id=\"post-2749\"]/div");
			initCrawler();
			realImagePath += "|" + crawImage("https://www.syu.ac.kr/teacher/course-guide/basic-policy/liberal-choice/",
					"//*[@id=\"post-2751\"]/div");
			initCrawler();
			realImagePath += "|"
					+ crawImage("https://www.syu.ac.kr/teacher/course-guide/basic-policy/foreign-language-education/",
							"//*[@id=\"post-2753\"]/div");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return realImagePath;
	}
}
