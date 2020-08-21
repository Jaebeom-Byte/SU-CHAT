package kr.ac.syu.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;


public class Corrector {
	// List<Map<String, Integer>>로 리턴
	public List<String> getCorrection(List<String> NAList) {
		List<String> NAs = NAList; // NAs이라는 List를 생성해서 parameter 로 받는 NounList의 명사들을 받아놓음
		List<String> confirmed = new ArrayList<>();

		Multimap<String, Integer> storage = ArrayListMultimap.create();
		
		DistanceEditor ExtractLev = new DistanceEditor(); // 레벤슈타인을 쓰기위해 객체를 생성
		
		List<String> dicts;
		Generator generator = Generator.getGenerator();

		dicts = generator.genarateDictionary("/resources/dictionary.properties");
		dicts = generator.genarateThesaurusList("/resources/thesaurus.properties");
		
		List<Integer> distance = new ArrayList<Integer>();
		
		int totalElementsOfNAs = NAs.size();
		int totalElementsOfdict = dicts.size();
		int index=0;
		for (int count_i = 0; count_i < totalElementsOfNAs; count_i++) {
			for (int count_j = 0; count_j < totalElementsOfdict; count_j++) {
				distance.add(ExtractLev.levenshteinDistance(NAs.get(count_i), dicts.get(count_j)));
				storage.put(dicts.get(count_j), distance.get(index));
				index ++;
			}
		}
		
		
		
		List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(storage.entries());
		Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
			// compare로 값을 비교
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
				// 오름 차순 정렬
				return obj1.getValue().compareTo(obj2.getValue());
			}
		});

		
		  for (Entry<String, Integer> entry : list_entries) {
			  if(entry.getValue()<=3) {
				  confirmed.add(entry.getKey());
			  }

		  }
		  
	
		  if(confirmed.isEmpty()) {
			  confirmed.add("null");
		  }

	     
	   return confirmed;

	}

}