package by.htp.cycles.logic;

//Требуется определить факториал числа, которое ввел пользователь.
import java.util.Scanner;

public class Task25 {
	public static void task() {

		Scanner sc = new Scanner(System.in);

		int a, d, s;
		s = 1;
		System.out.print(">>  ");
		a = sc.nextInt();
		System.out.println("a = " + a);

		String f = String.valueOf(a);

		for (int i = f.length(); i > 0; i--) {

			d = (a % (int) Math.pow(10, i)) / (int) Math.pow(10, (i - 1));
			s = d * s;

			System.out.println("факториал " + i + "го" + " числа " + d + " " + "из введенного числа " + a + " = " + s);
		}
	}
}