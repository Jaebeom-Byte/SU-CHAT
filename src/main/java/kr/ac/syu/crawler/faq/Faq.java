package kr.ac.syu.crawler.faq;

import kr.ac.syu.core.crawler.URLSender;

public class Faq extends URLSender { //자주묻는질문
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/academic/faq/");
	}
}