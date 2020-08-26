package kr.ac.syu.crawler.homepage;

import kr.ac.syu.core.crawler.URLSender;

public class SocialWelfare extends URLSender {
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/sw/");
	}
}
