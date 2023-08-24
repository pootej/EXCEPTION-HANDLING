/*Write a program which will illustrate NumberFormatException. 
Create a test method, with in the test method accept two numbers  
using next() method of scanner class. Convert into numerical 
values and print addition of two numbers.  */

import java.util.Scanner;

class NumberFormat {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		String a = s.nextLine();

		try {
			int c = Integer.parseInt(a); //exception
			System.out.println(c);
		} catch (NumberFormatException e) {
			System.out.println("NFE BABY");
		}
	}

}