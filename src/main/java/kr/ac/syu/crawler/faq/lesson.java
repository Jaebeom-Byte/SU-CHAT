package kr.ac.syu.crawler.faq;

import kr.ac.syu.core.crawler.URLSender;

public class lesson extends URLSender {  // 수업
	@Override
	public String process() {
		return linkPass("https://www.syu.ac.kr/academic/faq/?t=%EC%88%98%EC%97%85");
	}
}