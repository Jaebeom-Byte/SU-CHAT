package kr.ac.syu.crawler.homepage;

import kr.ac.syu.core.crawler.URLSender;

public class Comp extends URLSender { // 동물생명자원
	@Override
	public String process() {
		return linkPass("https://www.syu.ac.kr/anibiotech/");
	}
}
