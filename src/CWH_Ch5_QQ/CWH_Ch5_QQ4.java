package CWH_Ch5_QQ;

import java.util.Scanner;

public class CWH_Ch5_QQ4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.println("Enter a number from which you want to run this program");
            int n = inp.nextInt();

            System.out.println("------------------------------------");
            System.out.println("Result begins here:");
            for (int i = n; i != 0; i--) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } finally {
            inp.close();
        }
    }
}
