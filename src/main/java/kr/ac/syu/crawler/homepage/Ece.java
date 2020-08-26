package kr.ac.syu.crawler.homepage;

import kr.ac.syu.core.crawler.URLSender;

public class Ece extends URLSender { //유아 교육
	@Override
	public String process() {
		return linkPass("https://www.syu.ac.kr/ece/");
	}
}
