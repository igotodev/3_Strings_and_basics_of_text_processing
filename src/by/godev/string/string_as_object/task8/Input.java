package by.godev.string.string_as_object.task8;

import java.util.Scanner;

public class Input {
	public Input() {

	}

	public String getStringFromConsole() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String str;

		str = scan.nextLine();

		return str;
	}
}
