package by.htp.cycles.logic;

//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, 
//модуль которых больше или равен заданному е. Общий член ряда имеет вид:
//an = 1 /(3n−2)(3n+1);

public class Task20 {
public static void task() {
	double sum, e, a;
	e = 0.001;
	sum = 0;
	double i=1;
	while(true) {
		double temp;
		temp = 1/((3*i -2)*(3*i+1));
		a = Math.abs(temp);
		if(a>=e) {
			sum = sum + a; 
		}else {
			break;
		}
		i++;
	}
	
	System.out.print(sum);
}
}
