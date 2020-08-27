package kr.ac.syu.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.regex.Pattern;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class Corrector {
	public List<String> getCorrection(List<String> NAList) {
		List<String> NAs = NAList;
		List<String> confirmed = new ArrayList<>();

		Multimap<String, Integer> storage = ArrayListMultimap.create();

		DistanceEditor ExtractLev = new DistanceEditor();

		List<String> dicts = new ArrayList<>();
		Generator generator = Generator.getGenerator();

		dicts.addAll(generator.genarateDictionary("/resources/dictionary.properties"));
		dicts.addAll(generator.genarateThesaurusList("/resources/thesaurus.properties"));
		List<Integer> distance = new ArrayList<Integer>();
		
		String pattern = "^[a-zA-Z]*$";
		for (Iterator<String> it = dicts.iterator(); it.hasNext();) {
			String value = it.next();
			 boolean i = Pattern.matches(pattern,value);
			 if(i==true){
				it.remove();
			}
		}
		System.out.println(dicts);
		/*^[a-zA-Z]*$
		value.equals("ATM") || value.equals("FAQ") || value.equals("DB") || value.equals("F")
		|| value.equals("FA") || value.equals("IT") || value.equals("LMS")*/
		int totalElementsOfNAs = NAs.size();
		int totalElementsOfdict = dicts.size();
		int index = 0;
		for (int count_i = 0; count_i < totalElementsOfNAs; count_i++) {
			for (int count_j = 0; count_j < totalElementsOfdict; count_j++) {
				distance.add(ExtractLev.levenshteinDistance(NAs.get(count_i), dicts.get(count_j)));
				storage.put(dicts.get(count_j), distance.get(index));
				index++;
			}
		}

		List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(storage.entries());
		Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
				return obj1.getValue().compareTo(obj2.getValue());
			}
		});

		for (Entry<String, Integer> entry : list_entries) {
			if (entry.getValue() <= 2) {
				confirmed.add(entry.getKey());
			}
		}
		return confirmed;
	}
}