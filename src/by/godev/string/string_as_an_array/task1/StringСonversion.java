package by.godev.string.string_as_an_array.task1;

public class StringСonversion {

	public StringСonversion() {

	}

	public String toSnakeCase(String str) {
		String snakeCaseString;

		snakeCaseString = new String("");

		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				String one = str.substring(0, i);
				String two = str.substring(i);
				snakeCaseString = String.join("_", one, two).toLowerCase();
			}
		}

		return snakeCaseString;
	}

}
