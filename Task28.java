package by.htp.cycles.logic;

/* Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). 
Вычислить результат Z в зависимости от знака. Предусмотреть реакции на возможный
неверный знак операции, а также на ввод Y=0 при делении. Организовать возможность
многократных вычислений без перезагрузки программа (т.е. построить цикл). В качестве
символа прекращения вычислений принять ‘0’. */

import java.util.Scanner;

public class Task28 {
	public static void task() {
		int X, Y, Z;
		char ch;
		Z = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.print("Новый цикл. Для прекращения \nвычислений нажмите '0'. Введите число >> ");

			while (!sc.hasNextInt()) {
				sc.nextLine(); // програмка на дурака
				System.out.print("Введите число >> ");
			}

			X = sc.nextInt();
			if (X == 0) {
				System.out.println("Вы ввели '0' - прекратили вычисление");
				break;
			}
			System.out.println("X = " + X);

			System.out.print("Введите один из символов ' +, -, /, * '  >> ");
			ch = sc.next().charAt(0);
			System.out.println("операция " + " ' " + ch + " ' ");

			System.out.print("Введите число >> ");
			while (!sc.hasNextInt()) {
				sc.nextLine(); // програмка на дурака
				System.out.print("Введите число >> ");
			}

			Y = sc.nextInt();
			System.out.println("Y = " + Y);

			int b = (int) ch;
			// System.out.println("Соответствие значения символа, значению числа:
			// \n '-' =45\n '+' = 43\n '/' = 47\n '*' = 42");

			if (b == 45)
				Z = X - Y;

			if (b == 43)
				Z = X + Y;

			if (b == 47 & Y != 0) {
				Z = X / Y;
			} else if (Y == 0) {
				System.out.println("Операция не выполнется Вы ввели  '0', что запрещено при делении");
				continue;
			}

			if (b == 42)
				Z = X * Y;

			if (b != 45 & b != 43 & b != 47 & b != 42 & b != 0) {
				System.out.println("Введите правильное значение операции ");
				continue;
			}

			System.out.println("Результат вычисления Z = " + Z);

			System.out.println();
		}
	}
}
