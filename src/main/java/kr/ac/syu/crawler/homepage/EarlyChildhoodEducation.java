package kr.ac.syu.crawler.homepage;

import kr.ac.syu.core.crawler.URLSender;

public class EarlyChildhoodEducation extends URLSender { //유아 교육
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/ece/");
	}
}
