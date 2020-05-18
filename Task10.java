package by.htp.cycles.logic;

import java.math.BigInteger;

public class Task10 {
public static void task() {
//Составить программу нахождения произведения квадратов первых двухсот чисел.
	
	long  r, x;
	
    r = 1;
	x = 1;
	//BigInteger r1, x1;
	//r1 = BigInteger.valueOf(r);
	//x1 = BigInteger.valueOf(x);
	
	for (int i=1; i<=200; i++)
	{ x = i;
		x = x*x;
		//x1 = BigInteger.valueOf(x);
	   //r = x;
		//BigInteger r1 = BigInteger.valueOf(x);
		r= r*x;                    //BigInteger.valueOf
		System.out.print(r+" " );}
}
}
