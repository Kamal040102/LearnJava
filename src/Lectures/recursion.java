package Lectures;

public class recursion {
    /*
     * Iterative way of Factorial ==> n * (x-1) * (n-2) * ... * 1
     * 
     * Recursion = calling method1 inside method1
     * 
     * Recursive way of factorial==> n * factorial(n-1)
     * 
     * factorial(4) = 4 * factorial(3) 4 * 3 * factorial(2) 4*3*2* Factorial(1)
     * 4*3*2*1*factorial(0) 4*3*2*1*1 = 24
     */
    static int factorial(int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(factorial(n));
    }

}
