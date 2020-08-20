package kr.ac.syu.core.crawler;

// 각 클래스 크롤링 인터페이스

public interface Crawler {
	// 구현 메서드 클로링된 정보를 String 으로 반환하면 됨
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_PATH = "C:/selenium/chromedriver.exe";
	public static final String SAVE_PATH = "C:/selenium";

	String process();
}
