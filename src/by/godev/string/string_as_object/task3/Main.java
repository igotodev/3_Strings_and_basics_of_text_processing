package by.godev.string.string_as_object.task3;

/*
 * 3. Проверить, является ли заданное слово палиндромом.
 * */

public class Main {
	public static void main(String[] args) {
		Check check;
		String word1;
		String word2;
		String word3;
		String word4;
		String word5;
		String[] arr;

		check = new Check();
		word1 = "abba";
		word2 = "eve";
		word3 = "АДА";
		word4 = "доход";
		word5 = "день"; // не палиндром для примера
		arr = new String[] { word1, word2, word3, word4, word5 };

		for (int i = 0; i < arr.length; i++) {
			if (check.isPalindrome(arr[i])) {
				System.out.printf("Слово \"%s\" является палиндромом\n", arr[i]);
			} else {
				System.out.printf("Слово \"%s\" не является палиндромом\n", arr[i]);
			}
		}

	}
}
