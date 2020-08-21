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
			//이곳에 자신의 경로를 입력하세요
			komoranProvider.setUserDic("C:\\~\\syumoran.user");
			System.out.println("realPath: " + "비교해볼 사람은 자신의 경로를 이곳에 입력하시오");
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