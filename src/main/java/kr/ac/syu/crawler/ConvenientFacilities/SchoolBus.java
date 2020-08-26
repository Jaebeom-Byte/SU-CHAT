package kr.ac.syu.crawler.ConvenientFacilities;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class SchoolBus extends CaptureCrawler{
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/school-life/school-bus/"
				, "//*[@id=\"post-189\"]/div/div[3]/table"
				, "//*[@id=\"post-189\"]/div/div[4]/table"
				, "//*[@id=\"post-189\"]/div/div[5]/table"
				, "//*[@id=\"post-189\"]/div/div[6]/table"
				, "//*[@id=\"post-189\"]/div/div[7]/table"
				, "//*[@id=\"post-189\"]/div/div[8]/table"		
				);
	}
}
