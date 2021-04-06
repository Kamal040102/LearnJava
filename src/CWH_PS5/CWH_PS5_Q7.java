package CWH_PS5;

import java.util.Scanner;

public class CWH_PS5_Q7 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.print("Enter the time you want 1 to repat:\t");
            int x = inp.nextInt();

            int counter = 0;

            for (int i = 1; i <= x; i++) {
                System.out.println("1");
                counter++;
            }

            System.out.printf("\nCounter:\t%d", counter);
            System.out.println("\nThank You for using my code.");
        } finally {
            inp.close();
        }
    }
}
