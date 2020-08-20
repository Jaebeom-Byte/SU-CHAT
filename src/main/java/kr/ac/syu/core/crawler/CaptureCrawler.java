package kr.ac.syu.core.crawler;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public abstract class CaptureCrawler extends AbstractCrawler {
	@SuppressWarnings("unused")
	protected String crawImage(String url, String xpath) {
		String imagePath = null; 
		this.url = url;
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		screenshot = (TakesScreenshot) driver.findElement(By.xpath(xpath));
		
		byte[] imageByte = screenshot.getScreenshotAs(OutputType.BYTES);
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(SAVE_PATH + generateImagePath("screenshot"));
			fos.write(imageByte);
			imagePath = SAVE_PATH + generateImagePath("screenshot");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return imagePath;
	}
	
	private String generateImagePath(String xpath) {
		String fileName = "/";
		fileName += (xpath + ".png");
		return fileName;
	}
}
