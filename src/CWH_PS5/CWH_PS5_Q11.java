package CWH_PS5;

import java.util.Scanner;

public class CWH_PS5_Q11 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.print("Enter the time for which you want to repeat 2:\t");
            int x = inp.nextInt();
            int counter = 0;

            for (int i = 1; i <= x; i++) {
                System.out.println("1");
                counter++;
            }
            System.out.println("\nCounter: " + counter);
            System.out.println("\nThank You for using my code.");
        } finally {
            inp.close();
        }
    }
}
