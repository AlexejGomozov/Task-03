package by.htp.cycles.logic;

//В трехзначном числе зачеркнули старшую цифру. Когда полученное число 
//умножили на 7, то получили исходное число. Найти это число.

public class Task39 {
	public static void task() {

		String k;

		for (int i = 15; i <= 99; i++) { // диапазон наименьшего и наибольшего двузначных чисел умножение на 7, 
			                            //которые образуют трехзначное число

			int x = i * 7;

			String s = String.valueOf(x);

			String g = String.valueOf(i);

			for (int m = 1; m <= 9; m++) {

				String l = String.valueOf(m);

				k = l + g;

				int v = Integer.parseInt(k);

				if (v == x)
					System.out.print(s + ", " + l + ", " + g + ";");
			}
		}
	}
}
