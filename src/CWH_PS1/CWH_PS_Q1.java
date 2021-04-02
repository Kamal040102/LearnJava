package CWH_PS1;

import java.util.Scanner;

public class CWH_PS_Q1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);

        System.out.println("Enter a number");
        float a = inp.nextFloat();
        System.out.println("Enter another number");
        float b = inp.nextFloat();
        System.out.println("Enter another number");
        float c = inp.nextFloat();
        float sum = a + b + c;

        System.out.println("The of those number is\t" + sum);
    }
}
