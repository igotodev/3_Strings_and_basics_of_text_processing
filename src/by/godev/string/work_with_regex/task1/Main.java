package by.godev.string.work_with_regex.task1;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * 1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом  
 * три  различных операции:  
 * 1) отсортировать  абзацы  по  количеству  предложений;  
 * 2) в каждом предложении отсортировать слова по длине; 
 * 3) отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту. 
 * */

public class Main {

	public static void main(String[] args) {
		String str;
		TextLogic logic;
		TextView view;
		String[][] paragraphs;
		String[][] words;
		String[][] words2;
		int actionNumber;

		str = new String(
				"Хотя при всем том бывали дни, когда они предпочли бы, чтобы их кормили не цифрами, а чем-то более существенным.\n"
						+ "И тут до животных наконец дошло, что же сталось со свиными харями. Они переводили глаза со свиньи на человека,"
						+ " с человека на свинью и снова со свиньи на человека, но угадать, кто из них кто, было невозможно.\n"
						+ "Но, может быть, это в природе вещей? Может быть, земля наша так скудна,"
						+ " что не способна прокормить всех своих обитателей? Нет, товарищи, тысячу раз нет! Земля Англии плодородна,"
						+ " климат благоприятный, а пищи хватит нашим внукам и правнукам.");
		logic = new TextLogic();
		view = new TextView();

		System.out.printf("Возможные действия с текстом:\n");
		System.out.printf(
				"1) Отсортировать  абзацы  по  количеству  предложений;\n2) В каждом предложении отсортировать слова по длине;\n"
						+ "3) Отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,\nа в случае равенства – по алфавиту.\n");
		System.out.printf("\nПожалуйста введите номер операции:\n>> ");

		actionNumber = getIntFromConsole();
		while (actionNumber < 1 || actionNumber > 3) {
			System.out.printf("Пожалуйста, введите целое число от 1 до 3\n>> ");
			actionNumber = getIntFromConsole();
		}

		switch (actionNumber) {
		case 1: {
			int x;
			System.out.printf("\n1) По убыванию;\n2) По возрастанию;");
			System.out.printf("\nПожалуйста введите номер операции:\n>> ");
			x = getIntFromConsole();
			while (x < 1 || x > 2) {
				System.out.printf("Пожалуйста, введите целое число от 1 до 2\n>> ");
				x = getIntFromConsole();
			}
			if (x == 1) {
				paragraphs = logic.sortParagraphsByNumberOfSentences(str, true);
				view.printPreparedText(paragraphs);
				break;
			} else {
				paragraphs = logic.sortParagraphsByNumberOfSentences(str, false);
				view.printPreparedText(paragraphs);
				break;
			}
		}
		case 2: {
			int x;
			System.out.printf("\n1) По убыванию;\n2) По возрастанию;");
			System.out.printf("\nПожалуйста введите номер операции:\n>> ");
			x = getIntFromConsole();
			while (x < 1 || x > 2) {
				System.out.printf("Пожалуйста, введите целое число от 1 до 2\n>> ");
				x = getIntFromConsole();
			}
			if (x == 1) {
				words = logic.sortWordsByLengthInSentences(str, true);
				view.printPreparedText(words);
				break;
			} else {
				words = logic.sortWordsByLengthInSentences(str, false);
				view.printPreparedText(words);
				break;
			}
		}
		case 3: {
			char ch;
			System.out.printf("\nПожалуйста введите один кириллический символ:\n>> ");
			ch = getRUCharFromConsole();

			words2 = logic.sortWordsInSentenceByNumberOfGivenCharacters(str, ch);
			view.printPreparedText(words2);
			break;
		}
		}

	}

	public static int getIntFromConsole() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int value;

		while (!scan.hasNextInt()) {
			System.out.printf("Пожалуйста, введите целое число\n>> ");
			scan.next();
		}
		value = scan.nextInt();

		return value;
	}

	public static char getRUCharFromConsole() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String value;
		Pattern pattern;

		pattern = Pattern.compile("[А-Яа-я]");

		while (!scan.hasNext(pattern)) {
			System.out.printf("Пожалуйста, введите один кириллический символ\n>> ");
			scan.next();
		}
		value = scan.next();

		return value.charAt(0);
	}
}
