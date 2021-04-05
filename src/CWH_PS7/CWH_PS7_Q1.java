package CWH_PS7;

import java.util.Scanner;

public class CWH_PS7_Q1 {
    static void table(int x){
        int multiply = 1;
        for(int i = 1; i <= 10; i++){
            multiply = x * i;
            System.out.println(multiply);
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        try{
            System.out.println("Enter a number");
            int n = inp.nextInt();
            table(n);
        }
        finally{
            inp.close();
        }
    }
}
