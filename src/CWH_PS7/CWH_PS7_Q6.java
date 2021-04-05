package CWH_PS7;

public class CWH_PS7_Q6 {
    static float avg(float ...arr){
        float sum = 0;
        for(int i =0; i <= arr.length - 1; i++){
            sum += arr[i];
        }
        float average = sum/arr.length;
        return average;
    }
    public static void main(String[] args) {
        System.out.println(avg(1,2,3,4,5,6,7,8,9,10));
    }
}
