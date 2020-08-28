package kr.ac.syu.crawler.convenientfacilities;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class AllConvenientFacilities extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/school-life/facility-information/facility-information-all/",
				"//*[@id=\"post-2594\"]/div/div/ul/li[1]/div",
				"//*[@id=\"post-2594\"]/div/div/ul/li[2]/div",
				"//*[@id=\"post-2594\"]/div/div/ul/li[3]/div",
				"//*[@id=\"post-2594\"]/div/div/ul/li[4]/div",
				"//*[@id=\"post-2594\"]/div/div/ul/li[5]/div",
				"//*[@id=\"post-2594\"]/div/div/ul/li[6]/div",
				"//*[@id=\"post-2594\"]/div/div/ul/li[7]/div",
				"//*[@id=\"post-2594\"]/div/div/ul/li[8]/div",
				"//*[@id=\"post-2594\"]/div/div/ul/li[9]/div",
				"//*[@id=\"post-2594\"]/div/div/ul/li[10]/div"
		);
	}
}
