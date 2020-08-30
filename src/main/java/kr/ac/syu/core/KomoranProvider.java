package kr.ac.syu.core;

import kr.co.shineware.nlp.komoran.constant.DEFAULT_MODEL;
import kr.co.shineware.nlp.komoran.core.Komoran;

public class KomoranProvider {
	private static Komoran komoranProvider;
	
	private KomoranProvider() {}
	
	public static Komoran getKomoran() {
		if(komoranProvider == null) {
			komoranProvider = new Komoran(DEFAULT_MODEL.LIGHT);
			komoranProvider.setUserDic("C:\\Users\\Jaebeom\\Desktop\\web-ws\\su-chat-clone\\src\\main\\java\\resources\\syumoran.user");
		}
		return komoranProvider;
	}
}