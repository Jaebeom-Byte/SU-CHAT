package kr.ac.syu.core.crawler;

public abstract class URLSender implements Crawler {
	protected String packLink(String url) {
		String packUrl = "<a href=\"" + url + "\" target=\"_blank\">" + "이것을 찾으셨나요?" + "</a>";
		return packUrl;
	}
	
	protected String packLink(String text, String ... urls) {
		String packUrls = null;
		
		for(String url : urls) {
			int cnt = 0;
			if(packUrls == null) {
				packUrls = "<a href=\"" + url + "\" target=\"_blank\">" + (cnt++) + " : " + text + "</a>";
			} else {
				packUrls = "<br>" + "<a href=\"" + url + "\" target=\"_blank\">" + (cnt++) + " : " + text + "</a>";
			}
		}
		return packUrls;
	}
}