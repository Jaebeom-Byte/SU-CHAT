package kr.ac.syu.crawler.faq;

import kr.ac.syu.core.crawler.URLSender;

public class ApplicationClasses extends URLSender { //수강신청
	@Override
	public String process() {
		return linkPass("https://www.syu.ac.kr/academic/faq/?t=%EC%88%98%EA%B0%95%EC%8B%A0%EC%B2%AD");
	}
}