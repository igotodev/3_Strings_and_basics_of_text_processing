package by.godev.string.string_as_object.task3;

public class Check {
	public Check() {

	}

	public boolean isPalindrome(String word) {
		int count;

		count = 0;

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == word.charAt(word.length() - 1 - i)) {
				count++;
			}
			if (count == word.length()) {
				return true;
			}

		}

		return false;
	}
}
