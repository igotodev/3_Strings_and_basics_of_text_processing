package by.godev.string.string_as_object.task9;

/*
 * 9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. 
 * Учитывать только английские буквы. 
 * */

public class Main {

	public static void main(String[] args) {
		Input input;
		String str;
		String clearString;
		int countLowerCase;
		int countUpperCase;

		input = new Input();
		System.out.printf("Пожалуйста, введите строку\n>> ");
		str = input.getStringFromConsole();
		countLowerCase = 0;
		countUpperCase = 0;

		clearString = str.replaceAll("[^a-zA-Z]", "");

		for (int i = 0; i < clearString.length(); i++) {
			if (Character.isLowerCase(clearString.charAt(i))) {
				countLowerCase++;
			} else if (Character.isUpperCase(clearString.charAt(i))) {
				countUpperCase++;
			}
		}

		System.out.printf("В строке \"%s\"\nстрочных английских букв: %d\nпрописных английских букв: %d\n", str,
				countLowerCase, countUpperCase);

	}

}
