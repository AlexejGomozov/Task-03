package by.htp.cycles.logic;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Task29 {
	public static void task() {

		int a, b, x, y;

		a = 7676547;
		b = 239876;

		String a1 = String.valueOf(a);
		String b1 = String.valueOf(b);

		System.out.print("Цифры, входящие в запись как первого так и второго числа: ");

		for (int i1 = a1.length(); i1 >= 1; i1--) {

			x = (a % (int) Math.pow(10, i1)) / (int) Math.pow(10, (i1 - 1));

			for (int i2 = b1.length(); i2 >= 1; i2--) {

				y = (b % (int) Math.pow(10, i2)) / (int) Math.pow(10, (i2 - 1));

				if (x == y)
					System.out.print(x + "; ");
			}

		}
	}
}
