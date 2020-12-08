package by.htp.cycles.logic;

//Найдите наибольшую цифру данного натурального числа.

public class Task33 {
	public static void task() {
		int s, f, max;
		s = 5634566;
		max = 0;
		String s1 = String.valueOf(s);

		for (int i = s1.length(); i > 0; i--) {

			f = (s % (int) Math.pow(10, i)) / (int) Math.pow(10, (i - 1));

			// f = (int)s1.charAt(i); в char число 6 по таблице равно 54;

			if (max <= f) max = f ;
				
				
		}
		System.out.println(max);
	}

}
