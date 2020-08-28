package kr.ac.syu.crawler.selfgoverningbody;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ClubAssociation extends CaptureCrawler{ //동연회
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/school-life/student-autonomy-organization/student-autonomy-organization-all/",
				"//*[@id=\"post-2597\"]/div/div/ul/li[4]/div");
		
	}

}
