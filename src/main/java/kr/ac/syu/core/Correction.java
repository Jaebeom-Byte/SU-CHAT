package kr.ac.syu.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Correction {

	public Map<String, Integer> distanceMaker(List<String> NAList) {
		List<String> NAs = NAList; // NAs이라는 List를 생성해서 parameter 로 받는 NounList의 명사들을 받아놓음
		EditDistance ExtractLev = new EditDistance(); // 레벤슈타인을 쓰기위해 객체를 생성
//	Dictionaries dictionaries = new Dictionaries();
//	TheSauraus thesaurus = new TheSaurus();

		// List<String> dict = dictionaries.getList(); //dictionary 에서 StringList를 받아옴

		List<String> dicts;
		Generator generator = Generator.getGenerator();
		
		dicts=generator.genarateDictionary("/resources/dictionary.properties");
		dicts=generator.genarateThesaurusList("/resources/thesaurus.properties");
		/*
		 * dicts.add("컴퓨터"); dicts.add("공학");
		 */	
		
		// 실험용 dictionaries
//		Generator generator = new Generator();
		
		/*
		 * Map<String, String> dict
		 * =Generator.genarateThesaurusMap("/resources/thesaurus.properties");
		 * Iterator<String> iter = dict.keySet().iterator();
		 * 
		 * while(iter.hasNext()) { String courser = iter.next();
		 * 
		 * dicts.add(dict.get(courser));
		 * 
		 * }
		 */
		

//	List<String> saurus = thesaurus.getList(); //theSaurus 에서 StringList를 받아옴
		Map<String, Integer> Calculating = new HashMap<String, Integer>();
		Map<String, Integer> OutPut = new HashMap<String, Integer>();
		int totalElementsOfNAs = NAs.size();
		int totalElementsOfdict = dicts.size();
//		int[] distance = new int[100];
		List<Integer> distance = new ArrayList<Integer>();
		int count_i = 0;
		int count_j = 0;

		for (count_i = 0; count_i < totalElementsOfNAs; count_i++) {
			for (count_j = 0; count_j < totalElementsOfdict; count_j++) {
				distance.add(ExtractLev.levenshteinDistance(NAs.get(count_i), dicts.get(count_j)));
				Calculating.put(dicts.get(count_j), distance.get(count_j));
			}
		}
		List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(Calculating.entrySet());
		Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
			// compare로 값을 비교
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
				// 오름 차순 정렬
				return obj1.getValue().compareTo(obj2.getValue());
			}
		});
		// list_entries 가 오름차순 정렬된 맵<단어사전, 거리>
		
		
		for(Entry<String, Integer> entry : list_entries) {
			if(entry.getValue()<=2) {
				OutPut.put(entry.getKey(), entry.getValue());
			}
		}
		/*
		 * for (Entry<String, Integer> entry : list_entries) {
		 * OutPut.put(entry.getKey(), entry.getValue()); //
		 * System.out.println(entry.getKey() + " : " + entry.getValue()); break; }
		 */
		
		
		

		/*
		 * Iterator<String> mapIter = OutPut.keySet().iterator();
		 * 
		 * while(mapIter.hasNext()){
		 * 
		 * String key = mapIter.next(); Integer value = OutPut.get( key );
		 * 
		 * System.out.println(key+" : "+value);
		 * 
		 * }
		 */

		for (String key : OutPut.keySet()) {

			Integer value = OutPut.get(key);

			System.out.println(key + " : " + value);

		}

		return OutPut;

	}
	
	public List<String> sendCorrectionNA(Map<String, Integer> correctionNA){
		
		
	
		ArrayList<String> keyList = new ArrayList<String>(correctionNA.keySet());
		System.out.print(keyList.get(0));
		
		return keyList;
	}

	public static void main(String[] args) {
		List<String> NAList = new ArrayList<String>();
		NAList.add("굥학");
		Correction corect = new Correction();
		corect.sendCorrectionNA(corect.distanceMaker(NAList));

	}
}



