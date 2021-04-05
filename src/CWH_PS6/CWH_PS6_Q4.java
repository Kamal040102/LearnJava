package CWH_PS6;

public class CWH_PS6_Q4 {
    public static void main(String[] args) {
        int arr1[][] = new int [2][3];
        arr1[0][0] = 12;
        arr1[0][1] = 45;
        arr1[0][2] = 78;
        arr1[1][0] = 89;
        arr1[1][1] = 56;
        arr1[1][2] = 23;

        int arr2[][] = new int [2][3];
        arr2[0][0] = 21;
        arr2[0][1] = 54;
        arr2[0][2] = 87;
        arr2[1][0] = 98;
        arr2[1][1] = 65;
        arr2[1][2] = 32;

        // for(int i = 0; i <= arr1.length - 1; i++){
        //     for(int j = 0; j <= arr1[i].length - 1; j++){
        //         System.out.print(arr1[i][j] + "\t");
        //     }
        //     System.out.println("");
        // }

        // System.out.printf("\n\n");

        // for(int i = 0; i <= arr2.length - 1; i++){
        //     for(int j = 0; j <= arr2[i].length - 1; j++){
        //         System.out.print(arr2[i][j] + "\t");
        //     }
        //     System.out.println("");
        // }

        for(int i = 0; i <= arr1.length - 1; i++){
            for(int j = 0; j<=arr1[i].length-1;j++){
                int sum = 0;
                sum = arr1[i][j] + arr2[i][j];
                System.out.print(sum + "\t");
            }
            System.out.println("");
        }


    }
}
