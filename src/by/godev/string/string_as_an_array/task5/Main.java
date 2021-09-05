package by.godev.string.string_as_an_array.task5;

/*
 * 5. Удалить  в  строке  все  лишние  пробелы,  
 * то  есть  серии  подряд  идущих  пробелов  заменить  на  одиночные  пробелы. 
 * Крайние пробелы в строке удалить.
 * */

public class Main {
	public static void main(String[] args) {
		Correction correct;
		String str;
		String result;

		str = new String("   Один из   самых печальных     уроков истории заключается  в том, что, "
				+ "если мы     были     одурачены     достаточно долго, "
				+ "мы склонны отвергать     какие-либо доказательства    обмана.   Карл      Саган    ");
		correct = new Correction();

		result = correct.trimExtraSpaces(str);

		System.out.println(result);
	}
}
