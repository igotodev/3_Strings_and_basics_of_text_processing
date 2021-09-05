package by.godev.string.string_as_an_array.task2;

public class Replacement {
	public Replacement() {

	}

	public String replaceWord(String str, String word, String replacementWord) {
		String anotherStr;
		int midIndex;

		anotherStr = new String("");
		midIndex = 0;

		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == word.charAt(i) && str.charAt(j + i) == word.charAt(i)
						&& str.charAt(j + i) == word.charAt(i) && str.charAt(j + i) == word.charAt(i)) {
					anotherStr += str.substring(midIndex, j);
					anotherStr += replacementWord;
					midIndex = j + word.length();
				}
				if (j == str.length() - 1 && i == word.length() - 1) {
					anotherStr += str.substring(midIndex, str.length());
				}
			}
		}

		return anotherStr;
	}
}
