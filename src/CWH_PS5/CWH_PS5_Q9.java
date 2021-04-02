package CWH_PS5;

import java.util.Scanner;

public class CWH_PS5_Q9 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number:\t");
        int x = inp.nextInt();

        int sum = 0;

        for(int i = 1; i <= x; i++){
            int multiplication = 8 * i;
            sum = sum + multiplication;
        }

        System.out.println("\nThe sum of first " + x + " multiplication of 8 are:\t" + sum);
        System.out.println("\nThank You for using my code.");
    }
}
