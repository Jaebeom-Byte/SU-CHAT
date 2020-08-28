package kr.ac.syu.crawler.information;

import kr.ac.syu.core.crawler.URLSender;

public class FoundingAnnouncementNotice extends URLSender {
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/university-square/notice/employment-founding-announcement/",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[1]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[2]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[3]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[4]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[5]/td[1]/h3/a");
	}
}
