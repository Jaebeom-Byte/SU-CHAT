package kr.ac.syu.core.crawler.dept.healthandhumanperformance;

import kr.ac.syu.core.crawler.CaptureCrawler;

public class ProfessorYuJaeHyun extends CaptureCrawler {
	@Override
	public String process() {
		return crawImage("https://www.syu.ac.kr/syuhealth/faculty/professor/", "//*[@id=\"post-54\"]/div[2]/ul/li[2]/div/div[1]");
	}
}