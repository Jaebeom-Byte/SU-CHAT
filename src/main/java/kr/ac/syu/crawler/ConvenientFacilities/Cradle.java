package kr.ac.syu.crawler.ConvenientFacilities;

import kr.ac.syu.core.crawler.URLSender;

public class Cradle extends URLSender { //요람
	@Override
	public String process() {
		return linkPass("https://www.syu.ac.kr/about-sahmyook/regulations-and-cradles/cradle/");
	}
}
