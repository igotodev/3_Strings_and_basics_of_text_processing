package by.godev.string.string_as_object.task5;

public class Count {
	public Count() {

	}

	public int countCharacterFromString(String str, char ch) {
		int count;

		count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}

		return count;
	}
}
