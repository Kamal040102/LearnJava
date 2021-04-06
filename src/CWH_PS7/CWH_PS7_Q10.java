package CWH_PS7;

import java.util.Scanner;

public class CWH_PS7_Q10 {
    int sum(int x){
        int sumResult = 0;
        for(int i = 0; i <= x ; i++){
            sumResult += i;
        }
        return sumResult;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        CWH_PS7_Q10 obj3 = new CWH_PS7_Q10();
        try{
            System.out.println("Enter a number");
            int n = inp.nextInt();
            System.out.println(obj3.sum(n));
        }
        finally{
            inp.close();
        }
    }
}
