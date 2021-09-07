package by.godev.string.string_as_object.task8;

/*
 * 8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. 
 * Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 * */

public class Main {

	public static void main(String[] args) {
		Input input;
		Count counter;
		String str;
		String rightWord;

		input = new Input();
		counter = new Count();

		System.out.printf("Пожалуйста, введите строку\n>> ");
		str = input.getStringFromConsole();
		rightWord = counter.findLongestWord(str);

		System.out.printf("Самое длинное слово: %s\n", rightWord);

	}

}
