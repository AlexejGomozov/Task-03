package by.htp.cycles.logic;

/* Даны два двузначных числа А и В. Из этих чисел составили 2 четырехзначных числа: первое число 
  получили путем написания сначала числа А, затем В. Для получения второго числа сначала записали
  число В, затем А. Найти числа А и В если известно , что первое четырехзначное число нацело делится
  на 99, а второе на 49. */

public class Task37 {
public static void task() {
	int i, j, s, b1, b2;
	
	
	for (i = 11; i<= 99; i ++) {
		
		for (j = 11; j<= 99; j ++) {
			
			s = i * j;
			
			String h1 = String.valueOf(i);
			String h2 = String.valueOf(j);
			String h3 = h1 + h2;
			String h4 = h2 + h3;
			
			b1 = Integer.parseInt(h3);
			b2 = Integer.parseInt(h4);
			
			if (( b1 % 99 == 0) & ((b2 % 49) == 0)) System.out.println("b1 = "+ b1 + ", b2 = " + b2 + ", i = " + i + ", j = " + j + "; "); 
			
		}
	}
	
}
}