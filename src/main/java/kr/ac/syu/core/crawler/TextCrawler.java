package kr.ac.syu.core.crawler;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class TextCrawler extends AbstractCrawler {
	@SuppressWarnings("unused")
	protected String crawText(String url, String ... xpaths) {
		String text = "";
		this.url = url;
		driver.manage().window().maximize();
		driver.get(url);
		
		for(String xpath : xpaths) {
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(By.xpath(xpath));
			List<WebElement> timetable = driver.findElements(By.xpath(xpath));
		    for(WebElement roof : timetable) {
		    	text += roof.getText();
		    }
		    text += '|';
		}
		driver.quit();
		return text;
	}
	
	protected String crawList(String url, String mesg, String ... xpaths) {	
		this.url = url;
		driver.manage().window().maximize();
		driver.get(url);
		
		String text = mesg + "<br>";
		for(String xpath : xpaths) {
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(By.xpath(xpath));
			List<WebElement> timetable = driver.findElements(By.xpath(xpath));
		    for(WebElement roof : timetable) {
		    	if(roof.getAttribute("href") != null) {
		    		text += "<a href=\"" + roof.getAttribute("href") + "\">" + roof.getText().replaceAll("<.*?>", "") + "</a><br>";
		    	} else {
		    		text += "<a href=\"#\">" + roof.getText().replaceAll("<.*?>", "") + "</a>";
		    		break;
		    	}
		    }
		}
		driver.quit();
		return text;
	}
}
