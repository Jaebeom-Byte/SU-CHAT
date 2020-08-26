package kr.ac.syu.crawler.homepage;

import kr.ac.syu.core.crawler.URLSender;

public class AniBiotech extends URLSender { // 동물생명자원
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/anibiotech/");
	}
}
