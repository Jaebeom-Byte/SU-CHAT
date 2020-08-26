package kr.ac.syu.core.crawler;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public abstract class AbstractCrawler implements Crawler {
	private ChromeOptions options;
	protected WebDriver driver;
	protected WebElement element;
	protected TakesScreenshot screenshot;
	protected String image;
	protected String url;

	AbstractCrawler() {
		try {
			System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
			driver = new ChromeDriver();
			options = new ChromeOptions();
			options.addArguments("start-maximized"); // 최대크기로
			options.addArguments("headless"); // Browser를 띄우지 않음
			options.addArguments("disable-gpu"); // GPU를 사용하지 않음, Linux에서 headless를 사용하는 경우 필요함.
			options.addArguments("no-sandbox"); // Sandbox 프로세스를 사용하지 않음, Linux에서 headless를 사용하는 경우 필요함.		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
