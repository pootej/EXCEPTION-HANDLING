/*Write a program to create custom exception to perform 
deposit and withdraw options. Create InvalidAmountException 
and throw this exception whenever user trying to deposit 
or withdraw invalid amount. Deposit and withdraw amount should be 
multiples of 100 and it should be positive value.*/

import java.util.Scanner;
class MyException extends Exception{
    public String message(){
        return"AMOUNT SHOULD BE GREATER THAN 100 AND IN MULTIPLES OF 100";
    }
}
class operation{
    Scanner s=new Scanner(System.in);
    int bal=1000;
    void depsoit(){
        System.out.println("ENTER THE AMOUN TO BE DEPOSITED");
        int amt =s.nextInt();
        int depbal=amt+bal;
        System.out.println("BLANCE AFTER DEPOSIT");
        if(depbal%2==0){
            System.out.println(depbal);
        }
    }

    void withdraw() throws MyException{
        System.out.println("ENTER AMOUNT TO BE WITHDRAWN");
        int wit=s.nextInt();
        if(wit%100 ==0 && wit>100){
            int witbal=bal-wit;
            System.out.println("BAL AFTER WITHDRAW"+witbal);
        }
        else{
            throw new MyException();
        }
    }
}
class DepositException{
    public static void main(String[] args) {
        operation obj=new operation();
        try{
            obj.depsoit();
            obj.withdraw();
        }
        catch(MyException e){
            System.out.println(e.message());
        }
    }
}