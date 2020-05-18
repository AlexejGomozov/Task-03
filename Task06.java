package by.htp.cycles.logic;

import java.util.Scanner;

public class Task06 {
public static void task () {
	/*   Напишите программу, где пользователь вводит любое целое положительное
	   число. А программа  суммирует все числа от 1 до введенного пользователем 
	   числа */
	System.out.print("Введите число ");
	
	Scanner vr = new Scanner(System.in);
	 int x = vr.nextInt();
	  
	 int sum = 0;
	 
	  for(int n = 1; n<=x; n++ ) {
		  
		  
		  sum = sum +n;}
	  
	  System.out.print(sum + " ");
	  

}
}