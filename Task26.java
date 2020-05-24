package by.htp.cycles.logic;

import java.util.Scanner;

//Вывести на экран соответствий между символами и их численными обозначениями 
//в памяти компьютера (Таблицу ASCII).

public class Task26 {
	public static void task() {

		Scanner sc = new Scanner(System.in);
		char a;

		while (true) {

			System.out.println(">> ");
			a = sc.next().charAt(0);
			System.out.println(a);

			int b = (int) a;
			System.out.print(b);
			
			if (b == 97) break;
		}
		//sc.close();
	}
}