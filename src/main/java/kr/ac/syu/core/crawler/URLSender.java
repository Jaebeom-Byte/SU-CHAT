package kr.ac.syu.core.crawler;

import kr.ac.syu.core.crawler.AbstractCrawler;

public abstract class URLSender extends AbstractCrawler {
	protected String linkPass(String url) {
		String link = "";
		this.url = url;
		link = url;	
		return link;
	}
}