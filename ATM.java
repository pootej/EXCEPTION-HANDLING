/*Write a program to perform ATM operations such as deposit, 
withdraw and balance enquiry. Display list of options for user selection. 
Accept option from the user and execute specified method. 
throw Exception when user trying to withdraw amount more than 3 times. */

import java.util.Scanner;

class withdrawException extends Exception{
public String message(){
        return "LIMIT IS ONLY THREE TIMES A DAY";
    }
}

class Operations{
    Scanner s=new Scanner(System.in);
    int bal=1000;
    int witcount;

    void deposit(){
        System.out.println("Enter Amount depsit");
        int dep=s.nextInt();   
        int depbal=dep+bal;
        System.out.println("Balance after deposit is "+depbal);
    }
    void withdraw() throws withdrawException{
        System.out.println("Enter Amount to withdraw");
        int wit=s.nextInt();
        if(wit>bal){
            System.out.println("Invalid balance");
        }
        else{
            int witbal=bal-wit;
            System.out.println("Balance after withdraw "+witbal);
            witcount++;
            if(witcount>3){
                throw new withdrawException(); 
            }
            }
        }

        void bal(){
            System.out.println("Your Balance is"+bal);
        }

}

class ATM{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       Operations o=new Operations();
       while (true) {
        System.out.println("ATM Options:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Balance Enquiry");
        System.out.println("4. Exit");
        System.out.print("Select an option: ");
        int choice = s.nextInt();
    

    try{
        switch (choice){
            case 1:{
                o.deposit();
                break;
            }
            case 2:{
                o.withdraw();
                break;
            }
            case 3:{
                o.bal();
                break;
            }
            case 4:{
                System.out.println("THANK YOU");
                s.close();
                System.exit(0);
            }
            default:System.out.println("INVALID OPTION");
        }

    }
    catch(withdrawException e){
        System.out.println(e.message());

    }
}
}
}