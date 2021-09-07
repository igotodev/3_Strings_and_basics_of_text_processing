package by.godev.string.string_as_object.task1;

/*
 * 1. Дан текст(строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 * */

public class Main {
	public static void main(String[] args) {
		String text;
		int count;
		int max;

		text = new String("  la   la   la     uuuhuuu uhu ");
		count = 0;
		max = 0;

		for (int i = 0; i < text.length(); i++) {
			if (Character.isWhitespace(text.charAt(i))) {
				count++;
				if (count > max) {
					max = count;
				}
			} else {
				count = 0;
			}
		}

		System.out.println("Наибольшее количество подряд идущих пробелов: " + max);
	}
}
