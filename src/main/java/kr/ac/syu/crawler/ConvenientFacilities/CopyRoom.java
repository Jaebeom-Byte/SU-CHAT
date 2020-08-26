package kr.ac.syu.crawler.ConvenientFacilities;

import kr.ac.syu.core.crawler.URLSender;

public class CopyRoom extends URLSender { //복사실
	@Override
	public String process() {
		return linkPass("https://www.syu.ac.kr/school-life/facility-information/copy-room/");
	}
}
