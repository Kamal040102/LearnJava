package CWH_PS5;

import java.util.Scanner;

public class CWH_PS5_Q3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        System.out.println("Enter a number");
        int x = inp.nextInt();

        for(int i = 1; i <= 10; i++){
            int table = x * i;
            System.out.printf("%d * %d = %d\n", x, i, table);
        }
        System.out.println("\nThank You for using my code.");
    }
}
