package by.htp.cycles.logic;

//Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)

public class Task17 {
public static void task() {
	
	long sum, sum1, a, n;
	
	sum1 = 1;
	a = 2;
	n = 10;
	sum = 0;
	
	for ( long i = 1; i< n; i++) {
		
		sum = a + i;
		sum1 = sum1 * sum;
			
			System.out.print(sum1 + " ");}
}
}
