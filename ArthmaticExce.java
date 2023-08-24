/*Write a program which will illustrate ArthmeticException. 
Create a parameterized method which can take two values and 
print division of two numbers. Please write your comments regarding 
ArithmeticException such as "When ArithmeticException 
will occur in this program?". */
 

class ArthmaticExce{
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            int c=a/b; //exception
        System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("YOU CANT PRINT THIS AS THE REASON IS");
            System.out.println(e);
        }

    }
}