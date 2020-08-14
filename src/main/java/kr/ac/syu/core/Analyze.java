package kr.ac.syu.core;

import java.util.List;

import org.springframework.stereotype.Component;

import kr.co.shineware.nlp.komoran.constant.DEFAULT_MODEL;
import kr.co.shineware.nlp.komoran.core.Komoran;
import kr.co.shineware.nlp.komoran.model.KomoranResult;
import kr.co.shineware.nlp.komoran.model.Token;

@Component
public class Analyze {
	/*
	 * Komoran komoran = new Komoran(DEFAULT_MODEL.FULL); 
	 * String strToAnalyze =
	 * "대한민국은 민주공화국이다.";
	 * 
	 * KomoranResult analyzeResultList = komoran.analyze(strToAnalyze);
	 * 
	 * 
	 * 
	 * List<Token> tokenList = analyzeResultList.getTokenList(); 
	 * for (Token token :tokenList) { System.out.format("(%2d, %2d) %s/%s\n", token.getBeginIndex(),
	 * token.getEndIndex(), token.getMorph(), token.getPos()); }
	 */
	public List<Token> Komoran(String message) {
		Komoran komoran = new Komoran(DEFAULT_MODEL.FULL);
		
		String strToAnalyze = message;
		KomoranResult analyzeResultList = komoran.analyze(strToAnalyze);
		
				
		List<Token> tokenList = analyzeResultList.getTokenList();
		for(Token token : tokenList) {
			System.out.format("(%2d, %2d) %s/%s\n", token.getBeginIndex(),
			 token.getEndIndex(), token.getMorph(), token.getPos());
			
		}
		
		return tokenList;
	}
	
	
}


