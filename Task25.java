package by.htp.cycles.logic;

//Требуется определить факториал числа, которое ввел пользователь.
import java.util.Scanner;

public class Task25 {
	public static void task() {

		Scanner sc = new Scanner(System.in);

		int a, s;
		s = 1;
		System.out.print(">>  ");
		a = sc.nextInt();
		System.out.println("a = " + a);


		for (int i = 1; i <= a; i++) {

			s = i * s;			
		}
		System.out.println("факториал введенного числа " + a + " = " + s);
		sc.close();
		}
	}
}
//a = 10
//факториал введенного числа 10 = 3628800
