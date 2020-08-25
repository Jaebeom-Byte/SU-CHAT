package kr.ac.syu.crawler.homepage;

import kr.ac.syu.core.crawler.URLSender;

public class Envdh extends URLSender { //환경디자인원예
	@Override
	public String process() {
		return linkPass("https://www.syu.ac.kr/envdh/");
	}
}
