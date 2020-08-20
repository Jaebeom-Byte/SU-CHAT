package kr.ac.syu.core.crawler;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class TextCrawler extends AbstractCrawler {
	@SuppressWarnings("unused")
	protected String crawText(String url, String xpath) {
		String text = "";
		this.url = url;
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
	    List<WebElement> timetable = driver.findElements(By.xpath(xpath));
	    for(WebElement roof : timetable) {
	    	text += roof.getText();
	    }
		return text;
	}
}
