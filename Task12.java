package by.htp.cycles.logic;

public class Task12 {
public static void task() {
	//Последовательность аn строится так: а1 = 1, an =6+ аn-1 , 
	//для каждого n >1 Составьте программу нахождения произведения первых 10 
	//членов этой последовательности.
	
  long r, a; 
	a = 1;
	r = 1;
				for(int i=2; i<=10; i++){
					
			        a = 6 + (i-1);
					
				r = a * r;										
}
	                 System.out.print(r+" ");}
}
