//Write a Java program to create an integer array containing five numbers. Ask the user to enter an array position and display the element present at that position. If the user enters a position that does not exist in the array, handle the ArrayIndexOutOfBoundsException using a try-catch block and display "Invalid array position."
import java.util.Scanner;

public class ArrayPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {10, 20, 30, 40, 50};

        System.out.print("Enter array position = ");
        int position = sc.nextInt();

        try {
            System.out.println("Element = " + array[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array position.");
        }

        sc.close();
    }
}
