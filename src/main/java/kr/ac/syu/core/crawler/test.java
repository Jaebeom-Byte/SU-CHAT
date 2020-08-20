package kr.ac.syu.core.crawler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_PATH = "C:/selenium/chromedriver.exe";
	
	public static void main(String[] args) {
		process();
	}

	// 링크 연결 클래스
	public static String process() {
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		WebDriver driver = new ChromeDriver();
		String address = null;
		try {
			String url = "www.naver.com";
			// get page = 브라우저에서 url을 주소창에 넣은 후 request 한 것과 같다 (URL로 페이지 불러오기)
			driver.get(url);
			address = url;
		} catch (Exception e) {

			e.printStackTrace();

		}
		return address;
	}
}
