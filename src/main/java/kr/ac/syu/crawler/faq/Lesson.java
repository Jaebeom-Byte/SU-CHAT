package kr.ac.syu.crawler.faq;

import kr.ac.syu.core.crawler.URLSender;

public class Lesson extends URLSender {  // 수업
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/academic/faq/?t=%EC%88%98%EC%97%85");
	}
}