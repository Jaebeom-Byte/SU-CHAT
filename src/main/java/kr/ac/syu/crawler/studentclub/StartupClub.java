package kr.ac.syu.crawler.studentclub;

import kr.ac.syu.core.crawler.URLSender;

public class StartupClub extends URLSender {
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/school-life/circles/founding-club/");
	}
}
