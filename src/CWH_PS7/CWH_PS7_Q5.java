package CWH_PS7;

import java.util.Scanner;

public class CWH_PS7_Q5{
    static int fibonacci(int x){
        if(x == 0 || x == 1){
            return 0;
        }
        else if(x == 2 || x == 3){
            return 1;
        }
        else{
            return fibonacci(x-1) + fibonacci(x-2);
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try{
            System.out.println("Enter a number");
            int n = inp.nextInt();
            System.out.println(fibonacci(n));
        }   
        finally{
            inp.close();
        }    
    }
}