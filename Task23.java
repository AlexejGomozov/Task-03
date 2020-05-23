package by.htp.cycles.logic;

import java.util.Scanner;

/* Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h.
Результат представить в виде таблицы, первый столбец которой – значения аргумента,
второй - соответствующие значения функции:
F ( x ) = c t g (x/3) + 1/2 s i n ( x ) */

import java.util.Scanner.*;

public class Task23 {
public static void task() {
	int a, b;
	double f, h, x;
	
	Scanner sc = new Scanner(System.in); 
	System.out.print(">> ");
	a = sc.nextInt();
	System.out.print(">> ");
	b = sc.nextInt();
	System.out.print(">> ");
	h = sc.nextDouble();
	
	System.out.println("a = "+ a);
	System.out.println("b = "+ b);
	System.out.println("h = "+ h);
	
	System.out.println(" _________________________ ");
	System.out.println("|     x      |" + "     f      |");
	System.out.println("|------------|" + "------------|");

	
	for(x = a; x<=b; x+=h) {
		
		f = 1/Math.tan(x/3) + Math.sin(x)/2;
		
		System.out.printf("%-1s%-10f%-1s%-10f%-1s%n", "| ", x, " | ", f, " |");
		
	}
}
}
