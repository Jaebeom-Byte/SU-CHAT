package kr.ac.syu.crawler.studentclub;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class AllClub extends CaptureCrawler{
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/school-life/circles/general-club/",
				"//*[@id=\"main\"]/article/div/div/ul/li[1]/div", 
				"//*[@id=\"main\"]/article/div/div/ul/li[2]/div",
				"//*[@id=\"main\"]/article/div/div/ul/li[3]/div",
				"//*[@id=\"main\"]/article/div/div/ul/li[4]/div",
				"//*[@id=\"main\"]/article/div/div/ul/li[5]/div",
				"//*[@id=\"main\"]/article/div/div/ul/li[6]/div",
				"//*[@id=\"main\"]/article/div/div/ul/li[7]/div",
				"//*[@id=\"main\"]/article/div/div/ul/li[8]/div",
				"//*[@id=\"main\"]/article/div/div/ul/li[9]/div",
				"//*[@id=\"main\"]/article/div/div/ul/li[10]/div",
				"//*[@id=\"main\"]/article/div/div/ul/li[11]/div",
				"//*[@id=\"main\"]/article/div/div/ul/li[12]/div",
				"//*[@id=\"main\"]/article/div/div/ul/li[13]/div",
				"//*[@id=\"main\"]/article/div/div/ul/li[14]/div",
				"//*[@id=\"main\"]/article/div/div/ul/li[15]/div",
				"//*[@id=\"main\"]/article/div/div/ul/li[16]/div",
				"//*[@id=\"main\"]/article/div/div/ul/li[17]/div",
				"//*[@id=\"main\"]/article/div/div/ul/li[18]/div",
				"//*[@id=\"main\"]/article/div/div/ul/li[19]/div",
				"//*[@id=\"main\"]/article/div/div/ul/li[20]/div",
				"//*[@id=\"main\"]/article/div/div/ul/li[21]/div",
				"//*[@id=\"main\"]/article/div/div/ul/li[22]/div",
				"//*[@id=\"main\"]/article/div/div/ul/li[23]/div",				
				"//*[@id=\"main\"]/article/div/div/ul/li[24]/div");
	}

}
