package by.htp.cycles.logic;

/* Проверить введенную пользователем строку на наличие недопустимых символов.
В качестве первого символа допустимы только буквы и знак подчеркивания.
Остальные символы могут быть буквами, цифрами и знаком подчеркивания. */

import java.util.Scanner;

public class Task32 {
	public static void task() {
		int b, v;
		String s;
		char c, a;

		Scanner sc = new Scanner(System.in);

		System.out.print(">>  ");
		s = sc.nextLine();
		System.out.println(s);

		a = s.charAt(0);
		b = (int) a;
		
		if ((b == 95) | (b >= 65 & b <= 90) | (b >= 97 & b <= 122) | (b >= 1040 & b <= 1103))
			System.out.println(a);
		                          // 95 это символ "-" по таблице. остальное это символы лат алфавита 
		                          // кирилица не проходит (b>=1040 & b <= 1103)
		else  System.out.println("вы ввели символ " + a + " вне диапазона ");

		for (int i = 1; i < s.length(); i++) {

			c = s.charAt(i);
			v = (int) c;
			if ((v >= 65 & v <= 90) | (v >= 97 & v <= 122) | (v >= 48 & v <= 57) | (v == 95))
				System.out.println(c);
			else
				System.out.println("вы ввели символ " + v + " вне диапазона ");
		}
		sc.close();

	}
}