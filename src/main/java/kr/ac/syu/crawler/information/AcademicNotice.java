package kr.ac.syu.crawler.information;

import kr.ac.syu.core.crawler.TextCrawler;

public class AcademicNotice extends TextCrawler {
	@Override
	public String process() {
		return crawList("https://www.syu.ac.kr/university-square/notice/event/", "최근 학사공지 목록입니다.",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[1]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[2]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[3]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[4]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[5]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[6]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[7]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[8]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[9]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[10]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[11]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[12]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[13]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[14]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[15]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[16]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[17]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[18]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[19]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[20]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[21]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[22]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[23]/td[1]/h3/a",
				"//*[@id=\"main\"]/article/div/div[3]/table/tbody/tr[24]/td[1]/h3/a");
	}
}
