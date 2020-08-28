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
			options = new ChromeOptions();
			options.setCapability("ignoreProtectedModeSettings", true);
			options.addArguments("headless"); // Browser를 띄우지 않음
			options.addArguments("window-size=1920x1080");
			options.addArguments("disable-gpu"); // GPU를 사용하지 않음, Linux에서 headless를 사용하는 경우 필요함.
			options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.135 Safari/537.36");
			options.addArguments("no-sandbox"); // Sandbox 프로세스를 사용하지 않음, Linux에서 headless를 사용하는 경우 필요함.
			options.addArguments("disable-dev-shm-usage");
			options.addArguments("lang=ko");
			driver = new ChromeDriver(options);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

