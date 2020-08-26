package kr.ac.syu.crawler.curriculum;

import kr.ac.syu.core.crawler.URLSender;

public class NursingCur extends URLSender {
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/nursing/curriculum/department/curriculum/single-major-in-nursing/");
	}
}
