/*Write a program to accept firstName, lastName and mobileNumber in string format. 
 Print number of characters in firstName and lastName, and 
 print sum of digits of a mobileNumber. 
 Handle NumberFormatException while converting mobileNumber to long.
 */

import java.util.Scanner;

class Accept{
    Scanner s=new Scanner(System.in);
    void data(){
        System.out.println("ENTER YOUR FIRST NAME");
        String fname=s.next();
         System.out.println("ENTER YOUR LAST NAME");
        String lname=s.next();
         System.out.println("ENTER YOUR MOBILE NUMBER");
        String Mnum=s.next();
        System.out.println(fname.length());
        System.out.println(lname.length());
        
        try {
            long mobileNumber = Long.parseLong(Mnum);
            System.out.println("Mobile Number: " + mobileNumber);

            long sumOfDigits = 0;
            long tempNumber = mobileNumber;
            while (tempNumber > 0) {
                sumOfDigits += tempNumber % 10;
                tempNumber /= 10;
            }

            System.out.println("Sum of Digits: " + sumOfDigits);
        } catch (NumberFormatException e) {
            System.out.println("Invalid mobile number format.");
        }


    }
 }
public class StringExe {
    public static void main(String[] args) {
        Accept obj= new Accept ();
        obj.data();
    }
    
}
