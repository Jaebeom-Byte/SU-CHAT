package kr.ac.syu.crawler.homepage;

import kr.ac.syu.core.crawler.URLSender;

public class HealthAndHumanPerformance extends URLSender {
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/syuhealth/");
	}
}
