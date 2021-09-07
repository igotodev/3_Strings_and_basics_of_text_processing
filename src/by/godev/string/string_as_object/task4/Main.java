package by.godev.string.string_as_object.task4;

/*
 * 4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 * */

public class Main {

	public static void main(String[] args) {
		String str;
		String result;

		str = new String("информатика");
		result = new String("");

		result = result.concat(String.valueOf(str.charAt(7))).concat(String.valueOf(str.charAt(3)))
				.concat(String.valueOf(str.charAt(4))).concat(String.valueOf(str.charAt(7)));

		System.out.println(result);

	}

}
