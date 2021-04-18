package Lectures;

class base{
    int x;

    public int getX() {
        return this.x;
    }
}

class derived extends base{
    int y;

    public int getY() {
        return this.y;
    }


    public derived() {
        System.out.println("Enter a arguement");
    }

    public derived(int num1) {
        y = num1;
    }

    public derived(int num1, int num2){
        y = num1;
        x = num2;
    }    
}

public class cosntructors_in_inhertance {
    public static void main(String[] args) {
        derived obj1 = new derived();
        derived obj2 = new derived(12);
        derived obj = new derived(8, 10);
        System.out.println(obj.getY() + " " + obj.getX());
    }
}
