package CWH_Ch5_QQ;

import java.util.Scanner;

public class CWH_Ch5_QQ2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.println("Enter a number till which you want this program to run.");
            int i = inp.nextInt();
            int x = 1;
            do {
                System.out.println(x);
                x++;
            } while (x <= i);
        } finally {
            inp.close();
        }

    }
}
