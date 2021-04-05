package CWH_PS6;

public class CWH_PS6_Q8 {
    public static void main(String[] args) {
        int arr[] = {12,45,78,89,56,23};
        // arr[0][0] = 12;
        // arr[0][1] = 45;
        // arr[0][2] = 78;
        // arr[1][0] = 89;
        // arr[1][1] = 56;
        // arr[1][2] = 23;

        // for(int i = 0; i <= arr.length - 1; i++){
        //     for(int j = 0; j <= arr[i].length - 1; j++){
        //         if(arr[i][j] > arr[i++][j++]){
        //             System.out.println("The array is unsorted");
        //             break;
        //         }
        //         else{
        //             continue;
        //         }
        //     }
        // }

        for(int i = 0; i <= arr.length - 1; i++){
            for(int j = 0; j <= arr.length - 1; j++){
                if(arr[i] < arr[j]){
                    continue;
                }
                else{
                    System.out.println("The array is unsorted.");
                    break;
                }
            }
        }
    }
}
