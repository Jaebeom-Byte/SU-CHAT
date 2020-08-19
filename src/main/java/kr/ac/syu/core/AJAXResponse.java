package kr.ac.syu.core;

import java.util.Map;

public class AJAXResponse {
	private Generator generator = Generator.getGenerator();
	private DestinationExtractor destinationExtractor = DestinationExtractor.getDestinationExtractor();
	private MatchingClassFactory matchingClassFactory = MatchingClassFactory.getMatchingClassFactory();
	private String extractedKeword;
	
	public String getMessage(String userRequest) {
		String responseMsg = null;
		try {
			extractedKeword = destinationExtractor.getDestinationKeyword(userRequest);
			Map<String, String> map = generator.genarateKeyword("/resources/keyword.properties");
			if(map.containsKey(extractedKeword)) {
				responseMsg = matchingClassFactory.getMatchingClass(map.get(extractedKeword)).process();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(responseMsg == null) {
				responseMsg = "알아들을 수 없습니다.";
			}
		}
		return responseMsg; 
	}
}
