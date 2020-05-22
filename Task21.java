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
		h = 1.344556;
		a = 3;
		b = 8;
		
		Scanner sc1 = new Scanner(System.in);
		//Scanner sc2 = new Scanner(System.in);
		
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
							// f = (double)((int)(f*1000)%10000)/1000;

			// f = (int) (f*1000);
			// f = (double)f/1000;

			// String sp = "%-1s %-3f %-1s %-6f %-1s%n";
			// System.out.format(sp, "|" + x + "|" + f + "| " );

			System.out.printf("%-1s%-2f%-1s%-2f%-1s%n", "| ", x, " | ", f, " |");

			// System.out.println("|" + x + "|" + f + "| ");
			// System.out.printf("|" + x + "|" + "%5f \n", f );
			// System.out.println("|" + x + "|" + printf("%5f", (float)f);
			// System.out.println("|" + x + "|" + f + "| ");
		}

	}
}
