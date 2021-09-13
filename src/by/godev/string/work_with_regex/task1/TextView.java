package by.godev.string.work_with_regex.task1;

public class TextView {
	public TextView() {

	}

	public void printPreparedText(String[][] arrArrays) {
		for (int i = 0; i < arrArrays.length; i++) {
			System.out.printf("%d) ", i + 1);
			for (int j = 0; j < arrArrays[i].length; j++) {
				System.out.print(arrArrays[i][j] + ";\n");
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");
	}
}
