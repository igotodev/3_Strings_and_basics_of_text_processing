package by.godev.string.string_as_an_array.task5;

public class Correction {
	public Correction() {

	}

	public String trimExtraSpaces(String str) {
		String newString;
		int midIndex;

		newString = new String("");
		midIndex = 0;

		str = str.trim();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ') {
				newString += str.substring(midIndex, i);
				midIndex = i + 1;
			} else if (i == str.length() - 1) {
				newString += str.substring(midIndex, str.length());
			}
		}

		return newString;
	}
}
