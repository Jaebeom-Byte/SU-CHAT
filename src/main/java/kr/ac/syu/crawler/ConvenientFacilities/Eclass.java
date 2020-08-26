package kr.ac.syu.crawler.ConvenientFacilities;

import kr.ac.syu.core.crawler.URLSender;

public class Eclass extends URLSender {  // eclass연결
	@Override
	public String process() {
		return linkPass("https://lms.suwings.syu.ac.kr/ilos/main/main_form.acl");
	}
}
