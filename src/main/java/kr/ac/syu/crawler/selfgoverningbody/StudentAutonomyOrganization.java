package kr.ac.syu.crawler.selfgoverningbody;

import kr.ac.syu.core.crawler.URLSender;

public class StudentAutonomyOrganization extends URLSender {
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/school-life/student-autonomy-organization/student-autonomy-organization-all/");
	}
}
