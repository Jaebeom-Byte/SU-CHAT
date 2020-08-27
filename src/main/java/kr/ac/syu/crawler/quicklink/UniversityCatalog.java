package kr.ac.syu.crawler.quicklink;

import kr.ac.syu.core.crawler.URLSender;

public class UniversityCatalog extends URLSender { //요람
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/about-sahmyook/regulations-and-cradles/cradle/");
	}
}
