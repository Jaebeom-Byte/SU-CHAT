package kr.ac.syu.core;

import java.io.File;
import java.io.IOException;

import kr.co.shineware.nlp.komoran.constant.DEFAULT_MODEL;
import kr.co.shineware.nlp.komoran.core.Komoran;

public class KomoranProvider {
	private static Komoran komoranProvider;
	
	private KomoranProvider() {}
	
	public static Komoran getKomoran() {
		if(komoranProvider == null) {
			komoranProvider = new Komoran(DEFAULT_MODEL.LIGHT);
//			komoranProvider.setUserDic(getSyumoranPath());
			komoranProvider.setUserDic("C:\\Users\\PC\\Desktop\\web-ws\\SU-CHAT-git\\src\\main\\java\\resources\\syumoran.user");
			System.out.println("realPath: " + "C:\\Users\\PC\\Desktop\\web-ws\\SU-CHAT-git\\src\\main\\java\\resources\\syumoran.user");
		}
		return komoranProvider;
	}
	
	private static String getSyumoranPath() {
		File syumoran = new File("src/main/java/resources/syumoran.user");
		String syumoranPath;
		syumoranPath = syumoran.getAbsolutePath();
		System.out.println("syumoranPath: " + syumoranPath);
		return syumoranPath;
	}
}