package CWH_PS5;

import java.util.Scanner;

public class CWH_PS5_Q6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.print("Enter the time you want 5 to repeat:\t");
            int x = inp.nextInt();

            int i = 1;
            while (i <= x) {
                System.out.println("5");
                i++;
            }
            System.out.println("\nThank You for using my code.");
        } finally {
            inp.close();
        }
    }
}
