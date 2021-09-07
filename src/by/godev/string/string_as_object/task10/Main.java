package by.godev.string.string_as_object.task10;

/*
 * 10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, 
 * восклицательным или вопросительным знаком. Определить количество предложений в строке X.
 * */

public class Main {

	public static void main(String[] args) {
		String x;
		String clearString;
		int count;

		x = new String("Привет! Как дела? Давно тебя не видел.");

		// Simple
		clearString = x.replaceAll("[^.!?]", "");
		count = clearString.length();

		System.out.printf("В строке \"%s\" %d предложений(я)\n", x, count);

		// Simple, but a little more verbose
		count = 0;
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) == '.' || x.charAt(i) == '!' || x.charAt(i) == '?') {
				count++;
			}
		}

		System.out.printf("В строке %d предложений(я) (2-ой вариант подсчета)\n", count);
	}

}
