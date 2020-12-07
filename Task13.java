package by.htp.cycles.logic;

public class Task13 {
public static void task() {
	//Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] 
	//с шагом 0.5.
	double  y;
	//x = 1;
	y = 0; 
	
	for(double x=-5; x<=5; x+=0.5) {
		//x = i;
		y =  (5 - x*x/2);
	
		
	System.out.print(y + ", ");}
}
}
