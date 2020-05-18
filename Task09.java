package by.htp.cycles.logic;

public class Task09 {
public static void task() {
	//Найти сумму квадратов первых ста чисел.
	
	int x, sum;
	sum = 0;
	x = 0;
	for (int i=1; i<=100; i++){
		 x = i;
		x = x*x;
		 sum = x + sum;
		System.out.print(sum+ " ");
	}
}
}
