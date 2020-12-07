package by.htp.cycles.logic;

/*  Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их
 угадать. Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала
 программа, а также ошибочные числа пользователя. */

import java.util.Scanner;

public class Task31 {
public static void task() {
	int e, b, c, d, f;
	
	for (int i=1; i<=5; i++) {
	int a = 1 + (int) (Math.random()*15);
	
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Введите любое числло от 1 до 15 >>  ");
	  e = sc.nextInt();
	  System.out.println("e = "+ e);
    System.out.println ("Случайное число а = " + a);
    if (a == e) System.out.println ("Поздравляю e = a = " + a + ", Вы угадали!!!");
    else System.out.println ("Попробуйте еще раз. " + a + "не равно " + e + "; Обязательно повезет!)");
    System.out.println (" ");
	}
}
}
