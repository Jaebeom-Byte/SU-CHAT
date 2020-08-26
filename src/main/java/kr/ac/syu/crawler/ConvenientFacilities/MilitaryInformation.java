package kr.ac.syu.crawler.ConvenientFacilities;

import kr.ac.syu.core.crawler.URLSender;

public class MilitaryInformation extends URLSender { //예비군
	
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/school-life/military-information/s");
	}
}
