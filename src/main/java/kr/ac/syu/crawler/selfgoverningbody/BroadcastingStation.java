package kr.ac.syu.crawler.selfgoverningbody;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class BroadcastingStation extends CaptureCrawler{ // 방송국
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/school-life/student-autonomy-organization/student-autonomy-organization-all/",
				"//*[@id=\"post-2597\"]/div/div/ul/li[5]/div");
		
	}

}
