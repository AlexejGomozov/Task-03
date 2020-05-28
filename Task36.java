package by.htp.cycles.logic;

//Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, которое
//делится на их произведение. Найти эти числа.

public class Task36 {
	public static void task() {

		int i, j, s, b, k; 

		for (i = 11; i <= 99; i++) { 

			for (j = 11; j <= 99; j++) {

				s = i * j;

				String h1 = String.valueOf(i);
				String h2 = String.valueOf(j);

				String h3 = h1 + h2;                                       // String четырехзначное число

				// Integer b = Integer.valueOf(h3);

				b = Integer.parseInt(h3);                                  // int четырехзначное число

				k = b / s;
				
				if (b % s == 0)
					System.out.println("k = " + k + ", b = " + b + ", s = " + s + ", i = " + i + ", " + "j= " + j + ";");

			}

		}

	}
}
