package by.htp.cycles.logic;

public class Task05 {
public static void task() {
	/*С помощью оператора while напишите программу определения суммы 
	 * всех нечетных чисел в диапазоне от 1 до 99 включительно. */
   
	int x, m, sum;
	x = 1;
	m = 0;
	sum = 0;
	while (m <100) {
	m = m + x;
	if (m%2!=0)
	 {sum = m + sum; 
	System.out.print(sum+" ");}
	//x = x +2;}
	//System.out.print(sum + " ");
	}
}
}