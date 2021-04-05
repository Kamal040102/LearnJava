package Lectures;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int [][] arr = new int [2][2];

        arr [0][0] = 100;
        arr [0][1] = 105;
        arr [1][0] = 454;
        arr [1][1] = 200;

        // Printing using for loop
        for(int i = 0; i <= arr.length - 1; i++){
            for(int j = 0; j <= arr[i].length - 1; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }

    }
}
