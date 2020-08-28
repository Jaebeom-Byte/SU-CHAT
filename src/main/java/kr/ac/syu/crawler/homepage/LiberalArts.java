package kr.ac.syu.crawler.homepage;

import kr.ac.syu.core.crawler.URLSender;

public class LiberalArts extends URLSender { // 교양대학
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/teacher/");
	}
}
