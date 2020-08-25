package kr.ac.syu.core.crawler;


public abstract class URLSender extends AbstractCrawler {
	protected String linkPass(String url) {
		String link = "";
		this.url = url;
		link = url;	
		return link;
	}
}