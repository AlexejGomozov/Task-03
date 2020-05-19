package by.htp.cycles.logic;

//Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.

public class Task14 {
public static void task() {
	
	double k, n, sum;
	 n = 5;
	 k = 1;
	 sum = 0;
	for(double i=0; i<=n; i++) {
		k = 1/(1+i);
		sum = sum + k;}
		System.out.print(sum);
	
}
}
