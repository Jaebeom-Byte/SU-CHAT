package kr.ac.syu.core.crawler;


public abstract class URLSender extends AbstractCrawler {
	protected String linkPass(String url) {
		String text = "";
		this.url = url;
		text = url;	
		return text;
	}
}