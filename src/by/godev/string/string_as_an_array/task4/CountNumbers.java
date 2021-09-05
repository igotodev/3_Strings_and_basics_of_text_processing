package by.godev.string.string_as_an_array.task4;

import java.util.Arrays;

public class CountNumbers {
	public CountNumbers() {

	}

	public int countNumbersInString(String str) {
		String[] arr;
		int midIndex;
		int midCount;
		int finalCount;

		arr = new String[] {};
		midIndex = 0;
		midCount = 0;
		finalCount = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				arr = Arrays.copyOf(arr, arr.length + 1);
				arr[midCount] = str.substring(midIndex, i);
				midIndex = i + 1;
				midCount++;
			} else if (i == str.length() - 1) {
				arr = Arrays.copyOf(arr, arr.length + 1);
				arr[midCount] = str.substring(midIndex, i + 1);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				if (Character.isDigit(arr[i].charAt(j))) {
					finalCount++;
					break;
				}

			}
		}

		return finalCount;
	}
}
