package by.htp.cycles.logic;

//Написать программу, переводящую римские цифры в арабские.
//import java.io.IOException;
import java.util.Scanner;

public class Task30 {
	public static void task() {
		String k, s;
		char B, b;
		int a, c, d, h;
		c = 0;
		h = 0;
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Введите символ >> ");
			k = sc.nextLine();
			System.out.println(k);
			d = k.length();
			System.out.println(d);

			for (int i = d-1; i >= 0; i--) {

				b = k.charAt(i);

				a = (int) b;
				                      if (a == 73)  c = 1;			       
				                      if (a == 86)  c = 5;
				                      if (a == 88)  c = 10;                  	  
				                      if (a == 76)  c = 50;                    	  
				                      if (a == 67)  c = 100;
				                      if (a == 68)  c = 500;
				               	      if (a == 77)  c = 10000;
				                    	  	               		if (c > h) h = h + c;
				                      								else h = h - c;
				System.out.println(b);
				System.out.println(a);
				System.out.println(c);
				System.out.println(h);
				System.out.println(" ");
			}

		}
	}
}