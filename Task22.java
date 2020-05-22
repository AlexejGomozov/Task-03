package by.htp.cycles.logic;

//Составить программу для вычисления значений функции F(x) на отрезке [а, b]
//с шагом h. Результат представить в виде таблицы, первый столбец которой 
//– значения аргумента, второй - соответствующие значения функции:
//F(x)=sin^2(x);

import java.util.Scanner;

public class Task22 {
	public static void task() {
		int a, b;
		double x, f, h;

		Scanner sc2 = new Scanner(System.in);

		System.out.print(">> ");
		a = sc2.nextInt();
		System.out.print(">> ");
		b = sc2.nextInt();
		System.out.print(">> ");
		h = sc2.nextDouble();

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("h = " + h);

		System.out.println(" _____________________ ");
		System.out.println("|    x     |" + "    f     |");
		System.out.println("|----------|" + "----------|");

		for (x = a; x <= b; x += h) {

			f = Math.pow(Math.sin(x), 2);
			f = (float) f;
			x = (float) x;

			System.out.printf("%-1s%-2f%-1s%-2f%-1s%n", "| ", x, " | ", f, " |");
		}

	}
}
