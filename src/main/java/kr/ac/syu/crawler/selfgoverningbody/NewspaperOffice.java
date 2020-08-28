package kr.ac.syu.crawler.selfgoverningbody;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class NewspaperOffice extends CaptureCrawler{ //신문사
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/school-life/student-autonomy-organization/student-autonomy-organization-all/",
				"//*[@id=\"post-2597\"]/div/div/ul/li[7]/div");
		
	}

}
