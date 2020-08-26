package kr.ac.syu.core.crawler;

public abstract class URLSender implements Crawler {
	protected String packLink(String url) {
		String packUrl = "<a href=\"" + url + "\">" + "바로가기" + "</a>";
		return packUrl;
	}
}