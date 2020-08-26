package kr.ac.syu.crawler.ConvenientFacilities;

import kr.ac.syu.core.crawler.URLSender;

public class AutomatedTellerMachine extends URLSender { // ATM
	@Override
	public String process() {
		return linkPass("https://www.syu.ac.kr/school-life/facility-information/nh/");
	}
}
