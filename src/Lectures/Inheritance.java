package Lectures;

class base{
    int x;
    public void setX(int num){
        x = num;
    }
    public int getX(){
        System.out.println("I am from base class");
        return x;
    }
}

class derived extends base{
    int y;
    public void setY(int num1){
        y = num1;
    }
    public int getY(){
        System.out.println("I am form derived class");
        return y;
    }
}

public class Inheritance{
    public static void main(String[] args) {
        derived obj = new derived();
        obj.setX(12);
        obj.setY(24);
        System.out.println(obj.getX());
        System.out.println(obj.getY());
    }
}