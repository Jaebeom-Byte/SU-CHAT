package kr.ac.syu.util;

public class EditDistanceUtil {

	public int levenshteinDistance(String word1, String word2) {

		System.out.print(word1 + " | " + word2 + " = ");

		word1 = JasoTokenizerService.split(word1);
		word2 = JasoTokenizerService.split(word2);

		int word1_len = word1.length() + 1;
		int word2_len = word2.length() + 1;
		int cost = 0;

		if (word1.equals(word2)) {
			return 0;
		}

		int[][] costMatrix = initCostMatrix(word1_len, word2_len);

		for (int j = 1; j < word2_len; j++) {
			for (int i = 1; i < word1_len; i++) {
				if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
					cost = 0;
				} else {
					cost = 1;
				}
				costMatrix[i][j] = minimum(costMatrix[i - 1][j] + 1, costMatrix[i][j - 1] + 1,
						costMatrix[i - 1][j - 1] + cost);
			}
		}
		return costMatrix[word1_len - 1][word2_len - 1];
	}

	private int[][] initCostMatrix(int word1_len, int word2_len) {

		int[][] costMatrix = new int[word1_len][word2_len];

		for (int i = 1; i < word1_len; i++) {
			costMatrix[i][0] = i;
		}

		for (int i = 1; i < word2_len; i++) {
			costMatrix[0][i] = i;
		}

		return costMatrix;
	}

	private int minimum(int arg1, int arg2, int arg3) {

		int minimum = 100000;

		if (arg1 == arg2 && arg2 == arg3) {
			minimum = arg1;
		}

		if (arg1 < arg2 || arg1 < arg3) {
			minimum = arg1;
		}

		if (arg2 < arg1 || arg2 < arg3) {
			minimum = arg2;
		}

		if (arg3 < arg1 || arg3 < arg2) {
			minimum = arg3;
		}

		return minimum;
	}
}
