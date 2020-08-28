package kr.ac.syu.crawler.studentclub;

import kr.ac.syu.core.crawler.URLSender;

public class JobClub extends URLSender {
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/school-life/circles/employment-club/");
	}
}
