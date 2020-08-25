package kr.ac.syu.core.crawler;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public abstract class CaptureCrawler extends AbstractCrawler {
	// 본인 프로젝트 url 넣으세요.
	public static final String SAVE_PATH = "C:\\Users\\Jaebeom\\Desktop\\web-ws\\su-chat-clone\\webapp\\assets\\images";
	public static final String RETURN_PATH = "assets/images";
	
	@SuppressWarnings("unused")
	protected String crawImage(String url, String ... xpaths) {
		String imagePath = null;
		this.url = url;
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		for(String xpath : xpaths) {
			screenshot = (TakesScreenshot) driver.findElement(By.xpath(xpath));
			byte[] imageByte = screenshot.getScreenshotAs(OutputType.BYTES);	
			FileOutputStream fos = null;

			try {
				fos = new FileOutputStream(SAVE_PATH + generateImagePath(xpath));
				fos.write(imageByte);
				if(imagePath == null)
					imagePath = RETURN_PATH + generateImagePath(xpath);
				else
					imagePath += "|" + RETURN_PATH + generateImagePath(xpath);
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
		}
		driver.quit();
		return imagePath;
	}

	private String generateImagePath(String xpath) {
		String fileName = "/" + xpath.replaceAll("[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]", "") + ".png";
		return fileName;
	}
}
