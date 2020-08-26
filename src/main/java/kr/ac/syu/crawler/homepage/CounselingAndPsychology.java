package kr.ac.syu.crawler.homepage;

import kr.ac.syu.core.crawler.URLSender;

public class CounselingAndPsychology extends URLSender { // 상담심리
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/couns/");
	}
}
