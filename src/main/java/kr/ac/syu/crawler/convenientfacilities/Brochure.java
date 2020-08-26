package kr.ac.syu.crawler.convenientfacilities;

import kr.ac.syu.core.crawler.URLSender;

public class Brochure extends URLSender { //요람
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/about-sahmyook/regulations-and-cradles/cradle/");
	}
}
