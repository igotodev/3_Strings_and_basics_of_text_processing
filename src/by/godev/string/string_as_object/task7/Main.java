package by.godev.string.string_as_object.task7;

/*
 * 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. 
 * Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 * */

public class Main {
	public static void main(String[] args) {
		Input input;
		Correction correct;
		String str;
		
		System.out.printf("Пожалуйста, введите строку\n>> ");
		input = new Input();
		correct = new Correction();
		
		str = input.getStringFromConsole();
		str = str.replaceAll(" ", "");
		str = correct.removeDuplicateCharacters(str);

		System.out.println(str);

	}

}
