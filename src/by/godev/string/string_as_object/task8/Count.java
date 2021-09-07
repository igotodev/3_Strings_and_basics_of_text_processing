package by.godev.string.string_as_object.task8;

public class Count {
	public Count() {

	}

	public String findLongestWord(String str) {
		int midIndex;
		String maxLengthWord;

		midIndex = 0;
		maxLengthWord = new String("");

		for (int i = 0; i < str.length(); i++) {
			if (Character.isWhitespace(str.charAt(i))) {

				if ((str.substring(midIndex, i).length()) > maxLengthWord.length()) {
					maxLengthWord = str.substring(midIndex, i);
				}

				midIndex = i + 1;

			} else if (i == str.length() - 1) {

				if ((str.substring(midIndex, str.length()).length()) > maxLengthWord.length()) {
					maxLengthWord = str.substring(midIndex, str.length());
				}

			}
		}

		return maxLengthWord;
	}
}
