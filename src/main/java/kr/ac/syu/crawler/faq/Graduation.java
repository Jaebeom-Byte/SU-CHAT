package kr.ac.syu.crawler.faq;

import kr.ac.syu.core.crawler.URLSender;

public class Graduation extends URLSender { //졸업
	@Override
	public String process() {
		return linkPass("https://www.syu.ac.kr/academic/faq/");
	}
}