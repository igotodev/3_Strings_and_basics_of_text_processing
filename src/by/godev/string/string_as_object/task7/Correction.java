package by.godev.string.string_as_object.task7;

public class Correction {
	public Correction() {

	}

	public String removeDuplicateCharacters(String str) {
		StringBuilder sb;

		sb = new StringBuilder(str);

		for (int i = 0; i < sb.length(); i++) {
			for (int j = i + 1; j < sb.length(); j++) {
				if (sb.charAt(i) == sb.charAt(j)) {
					sb.deleteCharAt(j);
					j--;
				}
			}
		}

		str = sb.toString();

		return str;
	}
}
