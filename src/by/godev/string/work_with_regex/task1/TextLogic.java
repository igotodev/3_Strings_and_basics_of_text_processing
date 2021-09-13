package by.godev.string.work_with_regex.task1;

import java.util.Arrays;
import java.util.regex.Pattern;

public class TextLogic {
	public TextLogic() {

	}

	public String[][] sortParagraphsByNumberOfSentences(String str, final boolean reverse) {
		String[] arr;
		String[][] arrArrays;
		Pattern patternParagraph;
		Pattern patternString;

		patternParagraph = Pattern.compile("\\n");
		//(?<=X) 	X, via zero-width positive lookbehind
		patternString = Pattern.compile("(?<=\\.|!|\\?)\\s*");

		arr = patternParagraph.split(str);
		arrArrays = new String[][] {};

		for (int i = 0; i < arr.length; i++) {
			arrArrays = Arrays.copyOf(arrArrays, arrArrays.length + 1);
			arrArrays[i] = patternString.split(arr[i]);
		}

		if (reverse) {
			bubbleSortFromMoreToLess(arrArrays);
		} else {
			bubbleSortFromSmallestToLargest(arrArrays);
		}

		return arrArrays;
	}

	public String[][] sortWordsByLengthInSentences(String str, final boolean reverse) {
		String[] arr;
		String[][] arrArrays;
		Pattern patternString;
		Pattern patternWord;

		patternString = Pattern.compile("(?<=\\.|!|\\?)\\s*");
		patternWord = Pattern.compile("\\s*(\\s|\\.|\\?|!|,|-|–)\\s*");
		arr = patternString.split(str);
		arrArrays = new String[][] {};

		for (int i = 0; i < arr.length; i++) {
			arrArrays = Arrays.copyOf(arrArrays, arrArrays.length + 1);
			arrArrays[i] = patternWord.split(arr[i]);
		}

		for (int i = 0; i < arrArrays.length; i++) {
			for (int j = 0; j < arrArrays[i].length; j++) {
				if (reverse) {
					bubbleSortFromMoreToLess(arrArrays[i]);
				} else {
					bubbleSortFromSmallestToLargest(arrArrays[i]);
				}
			}
		}

		return arrArrays;
	}

	public String[][] sortWordsInSentenceByNumberOfGivenCharacters(String str, char ch) {
		String[] arr;
		String[][] arrArrays;
		Pattern patternString;
		Pattern patternWord;

		patternString = Pattern.compile("(?<=\\.|!|\\?)\\s*");
		patternWord = Pattern.compile("\\s*(\\s|\\.|\\?|!|,|-|–)\\s*");
		arr = patternString.split(str);
		arrArrays = new String[][] {};

		for (int i = 0; i < arr.length; i++) {
			arrArrays = Arrays.copyOf(arrArrays, arrArrays.length + 1);
			arrArrays[i] = patternWord.split(arr[i]);
		}

		for (int i = 0; i < arrArrays.length; i++) {
			for (int j = 0; j < arrArrays[i].length; j++) {
				bubbleDescendingSortByNumberOfGivenCharacters(arrArrays[i], ch);
			}
		}

		return arrArrays;
	}

	private void bubbleSortFromSmallestToLargest(String[][] arrArrays) {
		for (int i = 0; i < arrArrays.length; i++) {
			for (int j = 1; j < arrArrays.length - i; j++) {
				if (arrArrays[j].length < arrArrays[j - 1].length) {
					String[] mid;
					mid = arrArrays[j];
					arrArrays[j] = arrArrays[j - 1];
					arrArrays[j - 1] = mid;
				}
			}
		}
	}

	private void bubbleSortFromMoreToLess(String[][] arrArrays) {
		for (int i = 0; i < arrArrays.length; i++) {
			for (int j = 1; j < arrArrays.length - i; j++) {
				if (arrArrays[j].length > arrArrays[j - 1].length) {
					String[] mid;
					mid = arrArrays[j];
					arrArrays[j] = arrArrays[j - 1];
					arrArrays[j - 1] = mid;
				}
			}
		}
	}

	private void bubbleSortFromSmallestToLargest(String[] strs) {
		for (int i = 0; i < strs.length; i++) {
			for (int j = 1; j < strs.length - i; j++) {
				if (strs[j].length() < strs[j - 1].length()) {
					String mid;
					mid = strs[j];
					strs[j] = strs[j - 1];
					strs[j - 1] = mid;
				}
			}
		}
	}

	private void bubbleSortFromMoreToLess(String[] strs) {
		for (int i = 0; i < strs.length; i++) {
			for (int j = 1; j < strs.length - i; j++) {
				if (strs[j].length() > strs[j - 1].length()) {
					String mid;
					mid = strs[j];
					strs[j] = strs[j - 1];
					strs[j - 1] = mid;
				}
			}
		}
	}

	private void bubbleDescendingSortByNumberOfGivenCharacters(String[] strs, char ch) {
		for (int i = 0; i < strs.length; i++) {
			for (int j = 1; j < strs.length - i; j++) {
				if (numberOfCharacter(strs[j], ch) > numberOfCharacter(strs[j - 1], ch)) {
					String mid;
					mid = strs[j];
					strs[j] = strs[j - 1];
					strs[j - 1] = mid;
					// если количества вхождений заданного символа равны - сортируем по алфавиту
				} else if (numberOfCharacter(strs[j], ch) == numberOfCharacter(strs[j - 1], ch)) {
					if (strs[j].compareToIgnoreCase(strs[j - 1]) < 0) {
						String mid;
						mid = strs[j];
						strs[j] = strs[j - 1];
						strs[j - 1] = mid;
					}
				}
			}
		}
	}

	private int numberOfCharacter(String word, char ch) {
		int count;

		count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == ch) {
				count++;
			}
		}

		return count;
	}

}
