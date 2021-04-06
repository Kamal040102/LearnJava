package CWH_PS6;

import java.util.Scanner;

public class CWH_PS6_Q2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            int[] arr = new int[5];
            arr[0] = 7;
            arr[1] = 3;
            arr[2] = 12;
            arr[3] = 74;
            arr[4] = 100;

            System.out.print("Enter a number to search in array:\t");
            int numb = inp.nextInt();

            for (int i = 0; i <= arr.length - 1; i++) {
                if (numb == arr[i]) {
                    System.out.printf("Yes the number %d is present in the array at index %d", numb, i);
                } else {
                    continue;
                }
            }
        } finally {
            inp.close();
        }
    }
}
