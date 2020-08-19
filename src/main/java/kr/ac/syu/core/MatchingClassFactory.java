package kr.ac.syu.core;

public class MatchingClassFactory {
	private static MatchingClassFactory matchingClassFactory;
	
	public static MatchingClassFactory getMatchingClassFactory() {
		if(matchingClassFactory == null) {
			matchingClassFactory = new MatchingClassFactory();
		}
		return matchingClassFactory;
	}

	public Crawling getMatchingClass(String mappingKeyword) {
		Crawling mappingClass = null;
		try {
			mappingClass = (Crawling)Class.forName(mappingKeyword).newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return mappingClass;
	}
}
