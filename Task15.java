package by.htp.cycles.logic;

//Вычислить : 1+2+4+8+...+ 2 в 10 степени.

public class Task15 {
public static void task() {
	
	double sum;
	
	sum = 0;
	
	for (int n = 0; n<=10; n++) {
		
		sum = Math.pow(2, n );
	
	System.out.print(sum+ " ");}
}
	
	
}
