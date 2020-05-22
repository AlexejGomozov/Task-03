package by.htp.cycles.logic;

// Составить программу для вычисления значений функции F(x) на отрезке [а, b] 
// с шагом h. Результат представить в виде таблицы, первый столбец которой –
// значения аргумента, второй - соответствующие значения функции:
// F(x) = x − sin(x);
import java.util.Scanner;

public class Task21 {
	public static void task() {
		int a, b;
		double x, f, h;
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print(">>  ");
		a = sc1.nextInt();
		System.out.print(">>  ");
		b = sc1.nextInt();
		System.out.print(">>  ");
		h = sc1.nextDouble();
		
		System.out.println("a = " + a );
		System.out.println("b = " + b );
		System.out.println("h = " + h );
		
		System.out.println(" _____________________ ");
		System.out.println("|    x     |" + "    f     |");
		System.out.println("|----------|" + "----------|");

		for (x = a; x <= b; x += h) {

			f = x - Math.sin(x);
			f = (float) f;
			x = (float) x; // привел к float чтобы использовать в printf
							

			System.out.printf("%-1s%-2f%-1s%-2f%-1s%n", "| ", x, " | ", f, " |");

			
		}

	}
}
