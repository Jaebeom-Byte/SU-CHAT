package kr.ac.syu.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DestinationExtractor {
	public static DestinationExtractor destinationExtractor;
	private Generator gen;

	private DestinationExtractor() {
		gen = Generator.getGenerator();
	}
	
	public static DestinationExtractor getDestinationExtractor() {
		if(destinationExtractor == null) {
			destinationExtractor = new DestinationExtractor();
		}
		return destinationExtractor;
	}
	
	public String getDestinationKeyword(String message) throws Exception {
		Tokenizer Tokenizer = new Tokenizer();
		List<String> refinedNouns = Tokenizer.getNouns(message);
		List<String> trimmedNouns = mapRefinedOntoTrimmed(refinedNouns);
		Collections.sort(trimmedNouns);
		String destinationKeyword = trimmedNouns.toString().replaceAll(" ", "");
		System.out.println("DestinationExtractor.refinedNouns: " + refinedNouns);
		System.out.println("DestinationExtractor.trimmedNouns: " + trimmedNouns);
		System.out.println("DestinationExtractor.destinationKeyword: " + destinationKeyword);
		return destinationKeyword;
	}

	private List<String> mapRefinedOntoTrimmed(List<String> refinedNouns) throws Exception {
		List<String> dictionary = gen.genarateDictionary("/resources/dictionary.properties");
		HashMap<String, String> thesaurus = gen.genarateThesaurusMap("/resources/thesaurus.properties");
		ArrayList<String> trimmedNouns = new ArrayList<String>();
		
		refinedToTrimmed: for (String refinedNoun : refinedNouns) {
			for (String standardWord : dictionary) {
				if (refinedNoun.equals(standardWord)) {
					trimmedNouns.add(standardWord);
				} else {
					for (String synonym : thesaurus.keySet()) {
						if (refinedNoun.equals(synonym)) {
							trimmedNouns.add(thesaurus.get(synonym));
							continue refinedToTrimmed;
						}
					}
				}
			}
		}
		return trimmedNouns;
	}
}
