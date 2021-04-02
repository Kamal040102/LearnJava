package CWH_PS5;

import java.util.Scanner;


public class CWH_PS5_Q5 {
    public static void main(String[] args) { 
        Scanner inp = new Scanner (System.in);
        System.out.println("Enter a number to find the factorial:");
        int x = inp.nextInt();

        int factorial = x;

        for(int i = 1; i <= x - 1; i++){
            factorial = factorial * i;
        }

        System.out.printf("The factorial of %d is %d", x, factorial);
        System.out.println("\nThank You for using my code.");
    }
}
