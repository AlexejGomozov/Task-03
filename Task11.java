package by.htp.cycles.logic;

public class Task11 {
public static void task () {
	//Составить программу нахождения разности кубов первых двухсот чисел
	
	long x, d;
	x = 1;
	d = 1;
	
	for( int i=1; i <=200; i++)
		
		x = i;
	    x = x*x*x;
	   
	    d = d - x;
	    
	    System.out.print(d);
	
}
}
