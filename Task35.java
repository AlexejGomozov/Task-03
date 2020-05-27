package by.htp.cycles.logic;

//Найдите количество четных цифр данного натурального числа.

public class Task35 {
public static void task() {
	int n, f, count;
	n = 456789;
	count = 0;
	String s = String.valueOf(n);
	
	for( int i= 1; i<= s.length(); i++) {
		
		
		f = (n% (int) Math.pow(10, i))/(int)Math.pow(10, i-1);
		
		if (f%2 ==0) count ++; 
	}
	System.out.print("в числе n = " + n + ", - " + count + " четных цифры;");
}
}
