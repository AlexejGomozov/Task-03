package by.htp.cycles.logic;

//Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).

public class Task16 {
	public static void task() {
		
		long sum, sum1; 
		sum = 1;
		sum1 = 1;
		
		for(int i=2; i<=10; i ++) {
		
			sum = sum + i;
			sum1 = sum1 * sum;
			
		System.out.print(sum1+ " ");}
	}

}
