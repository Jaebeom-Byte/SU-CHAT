package kr.ac.syu.crawler.curriculum;

import org.openqa.selenium.chrome.ChromeDriver;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class LiberalArtsCur extends CaptureCrawler {
	@Override
	public String process() {
		String imagePath1 = crawImage("https://www.syu.ac.kr/teacher/course-guide/basic-policy/completed/",
				"//*[@id=\"post-2747\"]/div");
		try {
			initCrawler();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String imagePath2 = crawImage("https://www.syu.ac.kr/teacher/course-guide/basic-policy/cultural-essentials/",
				"//*[@id=\"post-2749\"]/div");
		try {
			initCrawler();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String imagePath3 = crawImage("https://www.syu.ac.kr/teacher/course-guide/basic-policy/liberal-choice/",
				"//*[@id=\"post-2751\"]/div");
		try {
			initCrawler();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String imagePath4 = crawImage(
				"https://www.syu.ac.kr/teacher/course-guide/basic-policy/foreign-language-education/",
				"//*[@id=\"post-2753\"]/div");
		String realImagePath = imagePath1 + "|" + imagePath2 + "|" + imagePath3 + "|" + imagePath4;
		return realImagePath;
	}
}
