package CWH_PS5;

import java.util.Scanner;

public class CWH_PS5_Q2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        System.out.println("Enter a number");
        int x = inp.nextInt();

        int sum = 0;

        for(int i = 1; i <= x; i++){
            if(i % 2 == 0){
                System.out.println(i);
                sum = sum + i;
            }
        }

        System.out.printf("\nSum of first %d even number is %d.",x,sum);
        System.out.println("\nThank You for using my code.");
    }
}
