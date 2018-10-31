package answers;

public class Question4 {

	public static int selectionFailedTradedesks(String[][] rows, int numberMachines) {
		int[] totals = new int[rows.length];
		for (int i = 0; i < rows.length; i++) {
			int rowTotal = 0;
			for (int j = 0; j < rows[i].length; j++) {
				if (rows[i][j] != "X") {
					rowTotal += Integer.parseInt(rows[i][j]);
				}
			}
			totals[i] = rowTotal;
		}
		int min = 0;
		for (int i = 0; i < totals.length; i++) {
			if (min <= totals[i]) {
				min = totals[i];
			}
		}
		return min;
	}

}
