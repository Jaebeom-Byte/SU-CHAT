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
		EditDistance extractLev = new EditDistance(); // 레벤슈타인을 쓰기위해 객체를 생성
		
		//	Dictionaries dictionaries = new Dictionaries();
		//	TheSauraus thesaurus = new TheSaurus();

		// List<String> dict = dictionaries.getList(); //dictionary 에서 StringList를 받아옴

		// 실험용 dictionaries
		List<String> dict = new ArrayList<String>();
		dict.add("장학");
		dict.add("공지");

		// theSaurus 에서 StringList를 받아옴
		Map<String, Integer> calculating = new HashMap<String, Integer>();
		Map<String, Integer> outPut = new HashMap<String, Integer>();
		int totalElementsOfNAs = NAs.size();
		int totalElementsOfdict = dict.size();
		List<Integer> distance = new ArrayList<Integer>();
//		int[] distance = new int[100];
		int count_i = 0;
		int count_j = 0;

		for (count_i = 0; count_i < totalElementsOfNAs; count_i++) {
			for (count_j = 0; count_j < totalElementsOfdict; count_j++) {
				distance.add(extractLev.levenshteinDistance(NAs.get(count_i), dict.get(count_j)), count_j);
//				distance[count_j] = extractLev.levenshteinDistance(NAs.get(count_i), dict.get(count_j));
				calculating.put(dict.get(count_j), distance.get(count_j));
			}
		}
		List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(calculating.entrySet());
		Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
			// compare로 값을 비교
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
				// 오름 차순 정렬
				return obj1.getValue().compareTo(obj2.getValue());
			}
		});
		// list_entries 가 오름차순 정렬된 맵<단어사전, 거리>

		for (Entry<String, Integer> entry : list_entries) {
			outPut.put(entry.getKey(), entry.getValue());
			break;
		}

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

		for (String key : outPut.keySet()) {
			Integer value = outPut.get(key);
			System.out.println(key + " : " + value);
		}
		return outPut;
	}
}
