package kr.ac.syu.crawler.faq;

import kr.ac.syu.core.crawler.URLSender;

public class Grade extends URLSender { //성적
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/academic/faq/?t=%EC%A1%B8%EC%97%85");
	}
}