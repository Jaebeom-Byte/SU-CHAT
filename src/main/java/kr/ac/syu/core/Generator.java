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
	private static HashMap<String, String> thesaurusMap;
	private static List<String> thesaurusList;
	private static List<String> dictionary;
	private static Set<Object> keys;

	private Generator() {
		prop = new Properties();
		dictionary = new ArrayList<String>();
		thesaurusMap = new HashMap<String, String>();
		thesaurusList = new ArrayList<String>();
	}
	
	public static Generator getGenerator() {
		if(generator == null) {
			generator = new Generator();
		}
		return generator;
	}

	public List<String> genarateDictionary(String configName) {	
		try {
			createKeys(configName);
			for(Object key : keys) {							
				dictionary.add((String)key);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return dictionary;
	}
	
	public List<String> genarateThesaurusList(String configName) {	
		try {
			createKeys(configName);
			for(Object key : keys) {							
				thesaurusList.add((String)key);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return thesaurusList;
	}	
	
	public HashMap<String, String> genarateThesaurusMap(String configName) {	
		try {
			createKeys(configName);
			for(Object key : keys) {	
				String value = prop.getProperty(key.toString());
				thesaurusMap.put((String)key, value);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return thesaurusMap;
	}
	
	private void createKeys(String configName) throws Exception {
		/*
		 * InputStream inputStream =
		 * Generator.getClass().getResourceAsStream(configName);
		 */
		
		InputStream inputStream = this.getClass().getResourceAsStream(configName);
		prop.load(inputStream);
		keys = prop.keySet();
		inputStream.close();
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
