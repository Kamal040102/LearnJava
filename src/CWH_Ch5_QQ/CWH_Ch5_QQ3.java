package CWH_Ch5_QQ;

import java.util.Scanner;

public class CWH_Ch5_QQ3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        try {
            System.out.println("Enter a number till which you want to run this program");
            int i = inp.nextInt();

            int counter = 0;

            for (int x = 0; x <= i; x++) {
                if (x % 2 != 0) {
                    System.out.println(x);
                    counter++;
                }
            }

            System.out.println("Total Odd Numbers Are:\t" + counter);
        } finally {
            inp.close();
        }
    }
}
