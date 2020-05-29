package by.htp.cycles.logic;

//Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои цифры.

public class Task40 {
	public static void task() {
		// int n = 26734;
		// int count = 0;

		for (int n = 100; n <= 600; n++) {

			String s = String.valueOf(n);

			int count = 0;

			for (int i = 1; i <= s.length(); i++) {

				int c = (n % (int) Math.pow(10, i)) / (int) Math.pow(10, i - 1);

				if (c == 0) continue; // т.к. делить на "0" нельзя (в if (n%c), исключаем из списка перечислений

				if (n % c == 0) {
					count++;
					
					if (count == s.length())
						System.out.println(n + "; ");
				}
			}
		}
	}
}