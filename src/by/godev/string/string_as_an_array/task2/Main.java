package by.godev.string.string_as_an_array.task2;

/*
 * 2. Замените в строке все вхождения 'word' на 'letter'.
 * */

public class Main {

	public static void main(String[] args) {
		String str;
		String result;
		String word;
		String replacementWord;

		// simple =)
		str = new String("This word is the best word on earth");
		word = new String("word");
		replacementWord = new String("letter");
		result = new String("");

		result = str.replaceAll(word, replacementWord);

		System.out.println(result);

		// little harder =)
		Replacement replace;
		String anotherStr;

		replace = new Replacement();
		anotherStr = new String("");

		anotherStr = replace.replaceWord(str, word, replacementWord);

		System.out.println(anotherStr);
	}

}
