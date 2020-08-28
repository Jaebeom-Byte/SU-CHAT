package kr.ac.syu.crawler.selfgoverningbody;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class StudentCouncil extends CaptureCrawler{ //학회
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/school-life/student-autonomy-organization/student-autonomy-organization-all/",
				"//*[@id=\"post-2597\"]/div/div/ul/li[3]/div");
		
	}

}
