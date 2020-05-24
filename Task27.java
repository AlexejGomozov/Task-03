package by.htp.cycles.logic;

// Для каждого натурального числа в промежутке от m до n вывести все делители, 
// кроме единицы и самого числа. m и n вводятся с клавиатуры. 

public class Task27 {
	public static void task() {
		int m, n, d;
		m = 8;
		n = 34;

		for (int i = m; i <= n; i++) {

			System.out.println("делители числа " + i + ":");

			for (int k = 2; k < n; k++) {
				d = i / k;

				if (i % k == 0 & i != k)
					System.out.println("делитель числа " + i + " = " + d);
			}
		}
	}
}
