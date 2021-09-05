package by.godev.string.string_as_an_array.task4;

/*
 * 4. В строке найти количество чисел.
 * */

public class Main {
	public static void main(String[] args) {
		CountNumbers counter;
		String str;
		int finalCount;

		str = new String("За 10 лет индекс вырос на 502.7%, а за прошедший год — на 48.5%");
		counter = new CountNumbers();
		finalCount = counter.countNumbersInString(str);

		System.out.printf("В строке \"%s\" присутствует %d чисел(a)\n", str, finalCount);
	}

}