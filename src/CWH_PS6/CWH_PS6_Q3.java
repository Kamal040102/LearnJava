package CWH_PS6;

public class CWH_PS6_Q3 {
    public static void main(String[] args) {
        int arr [] = new int [6];
        arr[0] = 7;
        arr[1] = 3;
        arr[2] = 12;
        arr[3] = 74;
        arr[4] = 100;
        arr[5] = 95;

        int sum = 0;

        for(int element : arr){
            sum = sum + element;
        }

        float average = (float) sum / arr.length;
        System.out.println("The average marks of students are " + average); 
    }
}
