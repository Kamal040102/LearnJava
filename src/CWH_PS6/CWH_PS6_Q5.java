package CWH_PS6;

public class CWH_PS6_Q5 {
    public static void main(String[] args) {
        int arr1[][] = new int [2][3];
        arr1[0][0] = 12;
        arr1[0][1] = 45;
        arr1[0][2] = 78;
        arr1[1][0] = 89;
        arr1[1][1] = 56;
        arr1[1][2] = 23;

        //Original Order Code
        System.out.println("MATRIX IN ORIGINAL ORDER:");
        for(int i = 0; i <= arr1.length - 1; i++){
            for(int j = 0; j <= arr1[i].length - 1; j++){
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("");

        // Reverse Order code
        System.out.println("MATRIX IN REVERSE ORDER:");
        for(int i = arr1.length - 1; i >= 0; i--){
            for(int j = arr1[i].length - 1; j >= 0; j--){
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
