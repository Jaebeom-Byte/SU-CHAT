package kr.ac.syu.crawler.homepage;

import kr.ac.syu.core.crawler.URLSender;

public class Pharmacy extends URLSender {
	@Override
	public String process() {
		return linkPass("https://www.syu.ac.kr/pharmacy/");
	}
}
