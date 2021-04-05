package Lectures;

public class VarArgs {
    // static int sum(int x, int y){
    //     return x + y;
    // }
    // static int sum (int x, int y, int z){
    //     return x+y+z;
    // }
    // static int sum (int x, int y, int z, int x1){
    //     return x+y+z+x1;
    // }
    // static int sum (int x, int y, int z, int x1, int y2){
    //     return x+y+z+x1+y2;
    // }

    // public static void main(String[] args) {
    //     System.out.println(sum(10,20));
    //     System.out.println(sum(10,20,30));
    //     System.out.println(sum(10,20,30, 40));
    //     System.out.println(sum(10,20,30, 40, 50));
    // }

    static int sum (int ...arr){
        int sumResult = 0;
        for(int i = 0; i <= arr.length - 1; i++){
            sumResult += arr[i];
        }
        return sumResult;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
    }
}
