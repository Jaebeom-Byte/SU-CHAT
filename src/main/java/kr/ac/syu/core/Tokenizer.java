package kr.ac.syu.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import kr.co.shineware.nlp.komoran.constant.DEFAULT_MODEL;
import kr.co.shineware.nlp.komoran.core.Komoran;
import kr.co.shineware.nlp.komoran.model.KomoranResult;
import kr.co.shineware.nlp.komoran.model.Token;

@Component
public class Tokenizer {


	public List<String> getNouns(String message) {
		Komoran komoran = new Komoran(DEFAULT_MODEL.LIGHT);
//		komoran.setUserDic("src/main/java/resources/syumoran.user");
		komoran.setUserDic("classpath:/resources/syumoran.user");

		String strToAnalyze = message;
		KomoranResult analyzeResultList = komoran.analyze(strToAnalyze);

		ArrayList<String> nounList = (ArrayList<String>) analyzeResultList.getMorphesByTags("NNP", "NNG");
		//----------------------------
		ArrayList<String> toPassList = new ArrayList<String>();
		ArrayList<Token> NAList = new ArrayList<Token>();
		List<Token> tokenList = analyzeResultList.getTokenList();
		
		
		for (Token token : tokenList) {

			if (token.getPos().equals("NA")) {
				NAList.add(token);
			}
		}


		for (Token token : NAList) {
			toPassList.add(token.getMorph());
		}
		
		Corrector correction = new Corrector();
		List<String> correctionList =  correction.getCorrection(toPassList);
		
		List<String> refinedNounList = new ArrayList<>();
		
	
		refinedNounList.addAll(nounList);
//		System.out.println(nounList);
		
		
		refinedNounList.addAll(correctionList);
//		System.out.println(correctionList);
	
		//--------------------
		
		Collections.sort(refinedNounList);
		/*
		 * for(String nouns : refinedNounList) { System.out.println(nouns); }
		 */
		
		for(int index=0; index < refinedNounList.size(); index++) {
			System.out.println(refinedNounList.get(index));
		}
		return refinedNounList;
	}

	
	 
}

