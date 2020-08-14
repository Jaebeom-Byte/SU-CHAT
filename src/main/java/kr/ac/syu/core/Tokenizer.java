package kr.ac.syu.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.shineware.nlp.komoran.constant.DEFAULT_MODEL;
import kr.co.shineware.nlp.komoran.core.Komoran;
import kr.co.shineware.nlp.komoran.model.KomoranResult;
import kr.co.shineware.nlp.komoran.model.Token;

@Service
public class Tokenizer {

	public static List<String> sendNA(String message) {
		Komoran komoran = new Komoran(DEFAULT_MODEL.FULL);

		String strToAnalyze = message;
		KomoranResult analyzeResultList = komoran.analyze(strToAnalyze);

		ArrayList<String> ToPassList = new ArrayList<String>();
		ArrayList<Token> NAList = new ArrayList<Token>();
		List<Token> tokenList = analyzeResultList.getTokenList();
		for (Token token : tokenList) {

			if (token.getPos().equals("NA")) {
				NAList.add(token);
			}
		}

		for (Token token : NAList) {
			System.out.format("%s/%s\n", token.getMorph(), token.getPos());
		}

		for (Token token : NAList) {
			ToPassList.add(token.getMorph());
		}
		int totalElements = ToPassList.size();// arrayList의 요소의 갯수를 구한다.
		for (int index = 0; index < totalElements; index++) {
			System.out.println(ToPassList.get(index));
		}

		return ToPassList;
	}

	public static List<String> sendNouns(String message) {
		Komoran komoran = new Komoran(DEFAULT_MODEL.FULL);

		String strToAnalyze = message;
		KomoranResult analyzeResultList = komoran.analyze(strToAnalyze);

		ArrayList<String> NounList = (ArrayList<String>) analyzeResultList.getMorphesByTags("NNP","NNG");
		
		// ArrayList<Token> NAList = new ArrayList<Token>();
		// List<Token> tokenList = analyzeResultList.getTokenList();

		/*
		 * for(Token token : NAList) { System.out.format( "%s/%s\n", token.getMorph(),
		 * token.getPos()); }
		 * 
		 * for(Token token : NAList) { NounList.add(token.getMorph()); }
		 */
		Collections.sort(NounList);
		int totalElements = NounList.size();// arrayList의 요소의 갯수를 구한다.
		for (int index = 0; index < totalElements; index++) {
			System.out.println(NounList.get(index));
		}

		return NounList;
	}

}
