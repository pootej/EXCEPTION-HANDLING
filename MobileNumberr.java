/*  Write a program to create custom exception to validate mobile number. Create InvalidMobileNumber and throw this exception whenever user enters the mobile number by not following the below conditions.
    ==> mobile number should contain only digits.
    ==> mobile number should contain only 10 digits.
    ==> mobile number should start with 9 or 8 or 7 or 6.
    Sample input: 
    Enter your mobile number: 4565333953
    Sample output: java.lang.InvalidMobileNumber: "Invalid mobile number"*/

import java.util.Scanner;

class MyException extends Exception{
        public String TenDig(){
            return"MOBILE NUMBER SHOULD HAVE 10 DIGITS ONLY";
        }
        public String Start(){
            return"MOBILE NUMBER SHOULD START WITH 9/8/7/6 ONLY";
        }
          public String dig(){
            return"MOBILE NUMBER SHOULD HAVE DIGIT ONLY";
        }
        
    }


    class Number extends MyException{
        Scanner s=new Scanner(System.in);
       
           void entry() throws MyException {
        System.out.println("ENTER YOUR MOBILE NUMBER");
        String input = s.nextLine();

        if (input.length() != 10) {
            throw new MyException();
        }

        char[] numChars = input.toCharArray();
        for (int i = 0; i < numChars.length; i++) {
            if (numChars[i] < '0' || numChars[i] > '9') {
                throw new MyException();
            }
        }

        char firstDigit = numChars[0];
        if (firstDigit != '9' && firstDigit != '8' && firstDigit != '7' && firstDigit != '6') {
            throw new MyException();
        }
    }
}

public class MobileNumberr {
    public static void main(String[] args) {
        Number n = new Number();
        try {
            n.entry();
            System.out.println("Mobile number is valid.");
        } catch (MyException e) {
            System.out.println("PLEASE CHECK THE CONDITIONS AND TRY AGAIN");
            System.out.println(e.TenDig());
            System.out.println(e.Start());
            System.out.println(e.dig());
        }
    }
}







            

        
    

public class NumCheck {
    public static void main(String[] args) {
        Number n=new Number();
        try{
            n.entry();
        }
        catch(MyException e){
            System.out.println(e.TenDig());
            System.out.println(e.Start());
            System.out.println(e.dig());

        }
    }
    
}
