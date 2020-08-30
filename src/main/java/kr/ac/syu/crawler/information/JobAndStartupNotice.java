package kr.ac.syu.crawler.information;

import kr.ac.syu.core.crawler.TextCrawler;

public class JobAndStartupNotice extends TextCrawler {
	@Override
	public String process() {
		return crawList("https://www.syu.ac.kr/university-square/notice/employment-founding-announcement/", "최근 취업과 창업공지 목록입니다.",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[1]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[2]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[3]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[4]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[5]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[6]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[7]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[8]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[9]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[10]/td[1]/h3/a");
	}
}
