package by.godev.string.string_as_an_array.task1;

/*
 * 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 * */

public class Main {
	public static void main(String[] args) {
		StringСonversion convert;
		StringsView view;
		String[] arr;
		String[] snakeCaseArray;

		convert = new StringСonversion();
		view = new StringsView();
		arr = new String[] { "indexRow", "firstName", "lastName", "maxNumber", "minNumber" };
		snakeCaseArray = new String[arr.length];

		for (int i = 0; i < arr.length; i++) {
			snakeCaseArray[i] = convert.toSnakeCase(arr[i]);
		}

		view.printArrayOfStrings(snakeCaseArray);

	}

}
