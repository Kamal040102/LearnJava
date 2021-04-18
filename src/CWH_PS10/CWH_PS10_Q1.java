package CWH_PS10;

class circle{
    public void name(){
        System.out.println("I am a circle.");
    }
}

class cylinder extends circle{
    @Override
    public void name(){
        System.out.println("I am a cylinder.");
    }
}

public class CWH_PS10_Q1 {
    public static void main(String[] args) {
        cylinder obj = new cylinder();
        obj.name();
    }    
}
