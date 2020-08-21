package kr.ac.syu.core.crawler;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class MultiTextCrawler extends AbstractCrawler {
	@SuppressWarnings("unused")
	protected String crawMultiText(String url, String ... xpaths) {
		String text = "";
		this.url = url;
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		for(String xpath : xpaths) {
			List<WebElement> timetable = driver.findElements(By.xpath(xpath));
		    for(WebElement roof : timetable) {
		    	text += roof.getText();
		    }
		    text += "<br>";
		}
		return text;
	}
}
