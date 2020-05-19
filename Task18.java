package by.htp.cycles.logic;

//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, 
//модуль которых больше или равен заданному е. Общий член ряда имеет вид:
//	an = (−1)^n−1 / n

public class Task18 {
	public static void task() {
		int i;
		i = 1;
		double elem, sum;
		double e = 0.001;
		sum = 0;
		while (true) {
			
			elem = Math.abs(Math.pow(-1, i-1)/i);
			
			if(elem>=e) {
				
				sum = sum + elem;
			} else { 
				break;
			}
			i++;
		
		}
		System.out.print(sum + " ");
	}
}
