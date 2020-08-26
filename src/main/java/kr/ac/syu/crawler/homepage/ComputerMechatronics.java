package kr.ac.syu.crawler.homepage;

import kr.ac.syu.core.crawler.URLSender;

public class ComputerMechatronics extends URLSender { // 메카트로닉스
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/comp/");
	}
}
