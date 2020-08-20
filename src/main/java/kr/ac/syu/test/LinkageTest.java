package kr.ac.syu.test;

import kr.ac.syu.core.DestinationExtractor;

public class LinkageTest {
	public static void main(String[] args) {
		
		DestinationExtractor de = DestinationExtractor.getDestinationExtractor();
		String message = "컴퓨터공학과";
		String keyword;
		try {
			keyword = de.getDestinationKeyword(message);
			System.out.println("in main:" + keyword);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

