package by.htp.cycles.logic;

//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, 
//модуль которых больше или равен заданному е. Общий член ряда имеет вид:
// an=1/2^n + 1/3^n

public class Task19 {
public static void task() {
	int i;
	double sum, e, a;
	e = 0.001;
	i = 1;
	sum = 0;
	while(true) {
		
		double temp;
		temp = 1/(Math.pow(2, i) + 1/Math.pow(3, i));
		a = Math.abs (temp);
		if(a>=e) {
		sum = sum + a;
		} else {
			break;
		}
		i++;
	}
	System.out.print(sum +" ");
}
}