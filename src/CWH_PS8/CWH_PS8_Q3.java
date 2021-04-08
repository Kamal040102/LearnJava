package CWH_PS8;

class square{
    float side;

    float printAreaOfSquare(){
        return side * side;
    }

    float printPerimeterOfSquare(){
        return 4 * side;
    }

    float printVolumeofSquare(){
        return side * side * side;
    }
}


public class CWH_PS8_Q3 {
    public static void main(String[] args) {
        square square1 = new square();
        square1.side = 5;
        System.out.println(square1.printAreaOfSquare());
        System.out.println(square1.printVolumeofSquare());
        System.out.println(square1.printPerimeterOfSquare());
    }
}
