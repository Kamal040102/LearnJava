package Lectures;

abstract class measurements {
     int x;
     int y;
     int z;

    public void setX(int length) {
        this.x = length;
    }

    public void setY(int height) {
        this.y = height;
    }

    public void setZ(int width) {
        this.z = width;
    }

    abstract public int area();

    abstract public int volume();
}

class square extends measurements {

    @Override
    public int area() {
        // TODO Auto-generated method stub
        return x * x;
    }

    @Override
    public int volume() {
        // TODO Auto-generated method stub
        return x * x * x;
    }


    public square(int x) {
        this.x = x;
    }

}

class rectangle extends measurements{
    @Override
    public int area() {
        // TODO Auto-generated method stub
        return x * z;
    }

    @Override
    public int volume() {
        // TODO Auto-generated method stub
        return x*y*z;
    }


    public rectangle(int x , int y, int z) {
        this.x = x;
        this.y =y;
        this.z = z;
    }
    
}

public class abstract_classes {
    public static void main(String[] args) {
        measurements obj = new rectangle(4,5,6);
        System.out.println(obj.area());
        System.out.println(obj.volume());
        System.out.println("\n");
        measurements obj1 = new square(7);
        System.out.println(obj1.area());
        System.out.println(obj1.volume());
    }
}
