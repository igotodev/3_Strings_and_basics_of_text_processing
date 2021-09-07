package by.godev.string.string_as_object.task6;

/*
 * 6. Из заданной строки получить новую, повторив каждый символ дважды.
 * */

public class Main {

	public static void main(String[] args) {
		StringBuilder str;
		StringBuilder result;

		str = new StringBuilder(
				"Все животные равны, но некоторые животные более равны чем другие. - Джордж Оруэлл «Скотный двор»");
		result = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			result.append(str.charAt(i));
			result.append(str.charAt(i));
		}

		System.out.printf("Оригинальная строка:\n%s\n", str);
		System.out.printf("\nНовая строка:\n%s\n", result);
	}

}
