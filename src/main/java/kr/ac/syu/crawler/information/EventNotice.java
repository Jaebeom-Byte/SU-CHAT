
package kr.ac.syu.crawler.information;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class EventNotice extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/university-square/notice/event/",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[1]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[2]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[3]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[4]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[5]/td[1]/h3/a");
	}
}
