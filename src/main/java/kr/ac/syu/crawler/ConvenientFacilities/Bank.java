package kr.ac.syu.crawler.ConvenientFacilities;

import kr.ac.syu.core.crawler.URLSender;

public class Bank extends URLSender {
	@Override
	public String process() {
		return linkPass("https://www.syu.ac.kr/school-life/facility-information/facility-information-all/");
	}
}
