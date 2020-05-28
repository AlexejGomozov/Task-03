package by.htp.cycles.logic;

/* Для заданного натурального числа определить, образуют ли его цифры арифметическую прогрессию. 
  Предполагается, что в числе не менее трёх цифр. Например: 1357, 963.  */

public class Task38 {
	public static void task() {
		int n, m, g, h1, h2, h4, h5, f, r;

		n = 123456749;

		String s = String.valueOf(n);

		for (m = 2; m < s.length(); m++) {

			h1 = (n % (int) Math.pow(10, m)) / (int) Math.pow(10, m - 1);
			h2 = (n % (int) Math.pow(10, m - 1)) / (int) Math.pow(10, m - 2);

			g = h2 - h1;

			for (r = s.length(); r >= 2; r--) {

				h4 = (n % (int) Math.pow(10, r)) / (int) Math.pow(10, r - 1);
				h5 = (n % (int) Math.pow(10, r - 1)) / (int) Math.pow(10, r - 2);

				f = h5 - h4;

				if (g == f)
					System.out.println("true " + "g = " + g + ", f = " + f
							+ "; Если результат каждого сравнения true, то данные цифры образуют арифметическую прогрессию");
				else
					System.out.println("false " + "g = " + g + ", f = " + f
							+ "; Если результат сравнения хоть единожды false, то данные цифры не образуют арифметическую прогрессию");
			}
		}
	}
}
