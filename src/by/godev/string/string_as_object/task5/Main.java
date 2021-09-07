package by.godev.string.string_as_object.task5;

/*
 * 5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 * */

public class Main {

	public static void main(String[] args) {
		Count counter;
		String str;
		int count;

		str = new String("При изучении наук примеры полезнее правил. - Исаак Ньютон");
		counter = new Count();
		count = counter.countCharacterFromString(str, 'а');

		System.out.printf("В строке \"%s\" символ \'a\' встречается %d раз(а)\n", str, count);
	}

}
