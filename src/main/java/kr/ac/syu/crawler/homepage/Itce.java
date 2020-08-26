package kr.ac.syu.crawler.homepage;

import kr.ac.syu.core.crawler.URLSender;

public class Itce extends URLSender { // 컴메카,메카
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/itce/");
	}
}
