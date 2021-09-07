package by.godev.string.string_as_object.task2;

/*
 * 2. В строке вставить после каждого символа 'a' символ 'b'.
 * */

public class Main {
	public static void main(String[] args) {
		String str;
		String result;

		str = new String("Two things are infinite: the universe and human stupidity; "
				+ "and I'm not sure about the universe. - Albert Einstein");

		// Simple
		result = str.replaceAll("a", "ab");
		System.out.println(result);

		// Little harder
		int midIndex;

		midIndex = 0;
		result = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				result += str.substring(midIndex, i + 1);
				result += "b";
				midIndex = i + 1;
			} else if (i == str.length() - 1) {
				result += str.substring(midIndex, str.length());
			}
		}

		System.out.println(result);
	}
}
