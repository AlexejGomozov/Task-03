package by.htp.cycles.logic;

/* Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. 
 * Преобразовать его в другое число, цифры которого будут следовать в обратном
 *  порядке по сравнению с введенным
    числом. */


public class Task24 {
	public static void task() {
		//int a, b, c, d, f; 
		int s, x, y, p, g;
		s = 34568;
        y =0;
        p = 10;
        g = 0;
       
		// a = (s % 100000)/10000;
		// b = (s % 10000)/1000;
		// c = (s % 1000)/100;
		// d = (s % 100)/10;
        // f = (s % 10);
		String s1 = String.valueOf(s);
		//int i = s1.length();
		for ( int i = s1.length();  i >= 1; i--) {
  
			x =  (s % (int)(Math.pow(p, i))) / (int)(Math.pow(p, (i - 1)));
			
			
			          
			     
			//  if (t == Math.abs(i - s1.length()))
			//  t ++;
			  
			
			g =  x * (int)Math.pow(10,Math.abs(i - s1.length())) + g;
			
			 System.out.println(i + "-е" +" число из числа "+s+ " = "+x+ ";");
		
          if (x%2==0)  y = x + y;
			//System.out.println(y);
   //       for (int t = 0; t<=s1.length();  t ++) { 
   //       	  g =  x * (int)Math.pow(10,t) + g; 	// t ++;     
          	  
          	//t = (i - s1.length() ) ;
          	  //System.out.println(g);
             // if(t != (i - s1.length() ));	
                    //      g =  x * (int)Math.pow(10,t) + g;
                                              //   { System.out.println(g);}
     //  if (  t != (i - s1.length() )  )
    	//break;
			
		}	
		System.out.println("  ");
	
		System.out.println("сумма положительных чисел из числа "+s+ " = "+y+ ";");
		
		System.out.println("  ");
		
		System.out.println("число "+ s + " в обратном порядке будет "+ g + ";");
  
        }   
		
		
	}	

