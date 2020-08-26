package kr.ac.syu.crawler.ConvenientFacilities;

import kr.ac.syu.core.crawler.URLSender;

public class AdmissionsOffice extends URLSender { //입학처
	@Override
	public String process() {
		return packLink("http://ipsi.syu.ac.kr/2016_syu/main/main.asp");
	}
}
