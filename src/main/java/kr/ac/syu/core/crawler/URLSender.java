package kr.ac.syu.core.crawler;

public abstract class URLSender implements Crawler {
	protected String packLink(String url) {
		String packUrl = "<a href=\"" + url + "\" target=\"_blank\">" + "이것을 찾으셨나요?" + "</a>";
		return packUrl;
	}
}