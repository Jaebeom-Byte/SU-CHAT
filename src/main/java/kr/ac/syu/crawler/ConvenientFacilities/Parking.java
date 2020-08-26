package kr.ac.syu.crawler.ConvenientFacilities;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class Parking extends CaptureCrawler{
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/school-life/parking/"
				, "//*[@id=\"post-191\"]/div/div[1]/table"
				, "//*[@id=\"post-191\"]/div/div[2]/table"
				, "//*[@id=\"post-191\"]/div/div[3]"	
				);
	}
}
