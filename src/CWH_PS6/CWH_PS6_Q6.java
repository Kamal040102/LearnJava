package CWH_PS6;

public class CWH_PS6_Q6 {
    public static void main(String[] args) {
        int arr[][] = new int [2][3];
        arr[0][0] = 12;
        arr[0][1] = 45;
        arr[0][2] = 78;
        arr[1][0] = 89;
        arr[1][1] = 56;
        arr[1][2] = 23;

        int greatestNumber = 0;

        for(int i = 0; i <= arr.length - 1; i++){
            for(int j = 0; j <= arr[i].length - 1; j++){
                if(arr[i][j] > greatestNumber){
                    greatestNumber = arr[i][j];
                }
                else{
                    continue;
                }
            }
        }

        System.out.println("The greatest number in the array is " + greatestNumber);
    }
}
