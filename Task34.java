package by.htp.cycles.logic;

//Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.

public class Task34 {
public static void task() {
	int  d, f, c; 
	//c = 0;
	f = 0;
	d = 1000;
	String s = String.valueOf(d);
	
	 while (d <=9999) {
	                                         // в комментариях начальные ошибки     //for(int i = d; i<=9999;  i++)  {
		                                                       // с = с + d;
		                                                       //String s = String.valueOf(d); 
		                                     //System.out.println("число d = число d = число d = число d = число d = "+d);
		                                     //  System.out.println(" ");
      c = 0;
		 
	 for (int j =1 ; j <= s.length(); j++) {   
		                                                           //for (int j = s.length(); j > 0; j--)   {   
		                                	 //System.out.println("степень >> "+ j);
			 
	  f = (d % (int)Math.pow(10,j))/(int)Math.pow(10,j-1) ;
		                                                           // f1 = (d % (int)Math.pow(10,j));
		                                                           //  System.out.println(" f1= "+f1);
		           
                                             // System.out.println("отдельное число f = "+f);
		           
	  c = c + f;
		                                      //  System.out.println("сумма чисел числа = " +c);
	 	                                      //             System.out.println("число d = "+d);
	                                    	  //System.out.println(" ");
		                                                   //if (c == 15) System.out.println("-"+d); //continue;}
		                                                   //if (d ==9999) break;
	 }  
	 if (c == 15) System.out.println("-"+d);
	 d++; 
  }
 }
}
