package kr.ac.syu.core.urlCenter;

import java.util.concurrent.TimeUnit;

import kr.ac.syu.core.crawler.AbstractCrawler;

public abstract class URLCenter extends AbstractCrawler {
	protected String linkPass(String url) {
		String text = "";
		this.url = url;
		text = url;	
		return text;
	}
}