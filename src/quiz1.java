public class quiz1 {
    public static void main(String[] args) {
        sumTwoNumbers();
        System.out.print(sumTwoNumbers());
    }

    public static int sumTwoNumbers(){
        int a = 50; //4 Byte => 32 Bit
        int b = 20; //4 Byte => 32 Bit
        return a + b; //Return => 1 Byte => 8 Bit
        //Total Space Covered: 17 + Some Bytes

        //Optimized Space Covered: 9 Bytes
    }
}
