package by.htp.cycles.logic;

import java.util.Scanner;

// Для каждого натурального числа в промежутке от m до n вывести все делители, 
// кроме единицы и самого числа. m и n вводятся с клавиатуры. 

public class Task27 {
	public static void task() {
		int m, n, d;

		Scanner sc = new Scanner(System.in);
		System.out.print(">> ");
		m = sc.nextInt();
		System.out.println("m = " + m);
		System.out.print(">> ");
		n = sc.nextInt();
		System.out.println("n = " + n);

		for (int i = m; i <= n; i++) {

			System.out.println("делители числа " + i + ":");

			for (int k = 2; k < m; k++) {
				d = i / k;

				if (i % k == 0 & i != k)
					System.out.println("делитель числа " + i + " = " + d);
			}
		}
	}
}
