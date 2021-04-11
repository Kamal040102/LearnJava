package CWH_PS9;

class rectangle{
    private int length;
    private int width;
    private int height;

    public rectangle(int x, int y){
        length = x;
        width = y;
    }

    public rectangle(int x, int y, int z){
        length = x;
        width = y;
        height = z;
    }

    public int perimeter(){
        return 2 * (length + width);
    }

    public int area(){
        return length * width;
    }

    public int volume(){
        return length * width * height;
    }
}

public class CWH_PS9_Q4{
    public static void main(String[] args) {
        rectangle rectangle1 = new rectangle(7, 8);
        System.out.println("Area:\t"+rectangle1.area());
        System.out.println("Perimeter:\t"+rectangle1.perimeter());
        System.out.println("Volume:\t"+rectangle1.volume());

        System.out.println("\n\n");
        rectangle rectangle2 = new rectangle(7, 8, 9);
        System.out.println("Area:\t"+rectangle2.area());
        System.out.println("Perimeter:\t"+rectangle2.perimeter());
        System.out.println("Volume:\t"+rectangle2.volume());
    }
}