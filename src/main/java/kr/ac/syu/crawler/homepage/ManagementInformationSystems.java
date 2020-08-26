package kr.ac.syu.crawler.homepage;

import kr.ac.syu.core.crawler.URLSender;

public class ManagementInformationSystems extends URLSender { //경영정보
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/manage/");
	}
}
