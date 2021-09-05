package by.godev.string.string_as_an_array.task3;

/*
 * 3. В строке найти количество цифр.
 * */

public class Main {

	public static void main(String[] args) {
		String str;
		int count;

		str = new String("За десять лет индекс вырос на 552%, а за прошедший год — на 48%.");
		count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				count++;
			}
		}

		System.out.printf("В строке \"%s\" присутствует %d цифр\n", str, count);
	}
}
