/*Write a program to accept two numbers, one Arithmetic operator such as 
+, -, / , *  and print output of Arithmetic operation.  
Write switch case to perform each operation. 
Handle ArithmeticException when you are performing division operation.*/

import java.util.Scanner;
class Number {
    Scanner s = new Scanner(System.in);

    void Entry() {
        try {
            System.out.println("ENTER FIRST DIGIT");
            int a = s.nextInt();
            int b = s.nextInt();

            System.out.println("Choose operation (+, -, *, /):");
            char operator = s.next().charAt(0);

            int result = 0;
            switch (operator) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    try {
                        result = a / b;
                    } catch (ArithmeticException e) {
                        System.out.println("Error: Division by zero");
                    }
                    break;
                default:
                    System.out.println("Invalid operator");
                    break;
            }

            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Enter only integers");
        }
    }
}

public class MathOperation {
    public static void main(String[] args) {
        Number n = new Number();
        n.Entry();
    }
}


