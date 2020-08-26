package kr.ac.syu.crawler.homepage;

import kr.ac.syu.core.crawler.URLSender;

public class ChemistyLifeScience extends URLSender {
	@Override
	public String process() { // 화학생명공학
		return packLink("https://www.syu.ac.kr/chem/");
	}
}
