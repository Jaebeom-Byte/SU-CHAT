package kr.ac.syu.core;

import kr.ac.syu.core.crawler.Crawler;

public class MatchingClassFactory {
	private static MatchingClassFactory matchingClassFactory;
	
	public static MatchingClassFactory getMatchingClassFactory() {
		if(matchingClassFactory == null) {
			matchingClassFactory = new MatchingClassFactory();
		}
		return matchingClassFactory;
	}

	public Crawler getMatchingClass(String mappingKeyword) {
		Crawler mappingClass = null;
		try {
			mappingClass = (Crawler)Class.forName(mappingKeyword).newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return mappingClass;
	}
}
