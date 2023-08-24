/*Write a program to create custom exception to validate password.
  Create InvalidPasswordFormatException and throw this exception
  whenever the user enters the password by not following the below conditions.
  ==> Password should contain at least one digit.
  ==> Password should contain at least one uppercase letter.
  ==> Password should contain at least one lowercase letter.
  ==> Password should contain at least one special character..
  ==> Password does not allow space .
*/

import java.util.Scanner;

class MyException extends Exception{
   public String OneDig(){
        return "Add atleast one digit to your password";
    }
   public String OneUpperCase(){
        return "Add atleast one Uppercase character to your password";
    }
   public  String OneLowerCase(){
        return "Add atleast one Uppercase character to your password";
    }
     
    }


class Pass{
    Scanner s=new Scanner(System.in);
    void entry() throws MyException{
        System.out.println("ENTER YOUR PASSWORD");
        String c=s.next();
        for(int i=0;i<c.length();i++){
             if(c.charAt(i)!='a'&&c.charAt(i)!='z'){
                throw new MyException();
             }
             else if(c.charAt(i)>='A'&&c.charAt(i)<='Z'){
                    throw new MyException();
             }
              else if(c.charAt(i)>='0'&&c.charAt(i)<='9'){
                throw new MyException();
             }
             else{
                System.out.println(c);
             }

              }
        }

    }

public class Paasword {
    public static void main(String[] args) {
        Pass p=new Pass();
        try{
            p.entry();
        }
        catch(MyException e){
            System.out.println(e.OneDig());
             System.out.println(e.OneLowerCase());
              System.out.println(e.OneLowerCase());
        }
    }
}
