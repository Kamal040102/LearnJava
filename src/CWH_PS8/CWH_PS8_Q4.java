package CWH_PS8;

class rectangle{
    float length;
    float breadth;
    float height;

    float printAreaOfRectangle(){
        return length * breadth;
    }

    float printPerimeterOfRectangle(){
        return 2*(length+breadth);
    }

    float printVolumeofRectangle(){
        return length * breadth * height;
    }
}


public class CWH_PS8_Q4 {
    public static void main(String[] args) {
        rectangle rectangle1 = new rectangle();
        rectangle1.length = 5;
        rectangle1.breadth = 6;
        rectangle1.height = 7;
        System.out.println(rectangle1.printAreaOfRectangle());
        System.out.println(rectangle1.printVolumeofRectangle());
        System.out.println(rectangle1.printPerimeterOfRectangle());
    }
}
