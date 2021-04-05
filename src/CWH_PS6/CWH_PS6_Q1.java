package CWH_PS6;

public class CWH_PS6_Q1 {
    public static void main(String[] args) {
        float [] arr = new float [5];
        arr[0] = 7.7445f;
        arr[1] = 3.41545f;
        arr[2] = 12.7874f;
        arr[3] = 74.1287f;
        arr[4] = 100.9999f;

        float sum = 0f;

        for(int i = 0; i <= arr.length - 1; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of the givern array:\t" + sum);
    }
}
