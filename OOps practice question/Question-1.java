//Write a Java program to demonstrate exception handling by performing division of two integer
//numbers entered by the user. The program should accept a numerator and a denominator and
//display the result. If the user enters zero as the denominator, handle the ArithmeticException
//using a try-catch block and display "Cannot divide by zero."

import java.util.Scanner;

public class ArithmeticExceptionDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First number = ");
        int num1 = sc.nextInt();

        System.out.print("Second number = ");
        int num2 = sc.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        sc.close();
    }
}
