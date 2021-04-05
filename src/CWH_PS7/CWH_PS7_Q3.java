package CWH_PS7;

import java.util.Scanner;

public class CWH_PS7_Q3 {
    static int sum(int x){
        if(x == 0){
            return 0;
        }
        else{
        return x + sum(x - 1);
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try{
            System.out.println("Enter a number");
            int n = inp.nextInt();
            System.out.println(sum(n));
        }
        finally{
            inp.close();
        }
    }
}
