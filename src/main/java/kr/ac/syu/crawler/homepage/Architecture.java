package kr.ac.syu.crawler.homepage;

import kr.ac.syu.core.crawler.URLSender;

public class Architecture extends URLSender { //건축학과
	@Override
	public String process() {
		return linkPass("https://www.syu.ac.kr/arch/");
	}
}
