package kr.ac.syu.core;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class Generator {
	private static Generator generator;
	private static Properties prop;

	private Generator() {
		prop = new Properties();
	}
	
	public static Generator getGenerator() {
		if(generator == null) {
			generator = new Generator();
		}
		return generator;
	}

	public List<String> genarateDictionary(String configName) {	
		List<String> dictionary = new ArrayList<String>();
		try {
			for(Object key : createKeys(configName)) {							
				dictionary.add((String)key);
			}
			initProp();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return dictionary;
	}
	
	public List<String> genarateThesaurusList(String configName) {	
		List<String> thesaurusList = new ArrayList<String>();
		try {
			for(Object key : createKeys(configName)) {							
				thesaurusList.add((String)key);
			}
			initProp();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return thesaurusList;
	}	
	
	public HashMap<String, String> genarateThesaurusMap(String configName) {
		HashMap<String, String> thesaurusMap = new HashMap<String, String>();
		try {
			for(Object key : createKeys(configName)) {	
				String value = prop.getProperty(key.toString());
				thesaurusMap.put((String)key, value);
			}
			initProp();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return thesaurusMap;
	}
	
	private Set<Object> createKeys(String configName) throws Exception {
		/*
		 * InputStream inputStream =
		 * Generator.getClass().getResourceAsStream(configName);
		 */
		InputStream inputStream = this.getClass().getResourceAsStream(configName);
		prop.load(inputStream);
		Set<Object> keys = prop.keySet();
		inputStream.close();
		return keys;
	}
	
	private void initProp() {
		prop.clear();
	}
	
	/*public static void main(String[] args) {
		Generator g = new Generator();
		Map<String, String> dict = g.genarateThesaurusMap("/resources/thesaurus.properties");
		Iterator<String> iter = dict.keySet().iterator();
		
		while(iter.hasNext()) {
			String courser = iter.next();
			System.out.print(courser + " : ");
			System.out.println(dict.get(courser));
		}
	}*/
}
