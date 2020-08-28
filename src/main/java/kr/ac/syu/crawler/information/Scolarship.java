package kr.ac.syu.crawler.information;

import kr.ac.syu.core.crawler.URLSender;

public class Scolarship extends URLSender {
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/academic/scholarship-information/scholarships/");
	}
}
