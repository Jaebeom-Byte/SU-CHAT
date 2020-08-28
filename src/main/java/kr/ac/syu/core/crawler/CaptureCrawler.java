package kr.ac.syu.core.crawler;

import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public abstract class CaptureCrawler extends AbstractCrawler {
	// 본인 프로젝트 url 넣으세요.
	public static final String SAVE_PATH = "C:\\Users\\Jaebeom\\Desktop\\web-ws\\su-chat-clone\\webapp\\assets\\images";
	public static final String RETURN_PATH = "assets/images";
	
	@SuppressWarnings("unused")
	protected String crawImage(String url, String ... xpaths) {
		String imagePath = null;
		this.url = url;
		driver.manage().window().maximize();
		driver.get(url);
		
		for(String xpath : xpaths) {
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(By.xpath(xpath));
			BufferedImage img = new AShot().coordsProvider(new WebDriverCoordsProvider()).shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver, driver.findElement(By.xpath(xpath))).getImage();
			FileOutputStream fos = null;

			try {
				fos = new FileOutputStream(SAVE_PATH + generateImagePath(url, xpath), false);
				ImageIO.write(img, "png", fos);
				if(imagePath == null)
					imagePath = RETURN_PATH + generateImagePath(url, xpath);
				else
					imagePath += '|' + RETURN_PATH + generateImagePath(url, xpath);
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

	private String generateImagePath(String url, String xpath) {
		String fileName = "/" + url.replaceAll("[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]", "") + xpath.replaceAll("[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]", "") + ".png";
		return fileName;
	}
}
