package kr.ac.syu.crawler.convenientfacilities;

import kr.ac.syu.core.crawler.URLSender;

public class CopyingRoom extends URLSender { //복사실
	@Override
	public String process() {
		return packLink("https://www.syu.ac.kr/school-life/facility-information/copy-room/");
	}
}
