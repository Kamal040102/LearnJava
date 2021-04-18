package Lectures;

class Nokia{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void name(){
        System.out.println("I am nokia 3310c");
    }
}

class OnePlus extends Nokia{
    public void swagat(){
        System.out.println("Aapka swagat he");
    }
    public void name(){
        System.out.println("I am OnePlus 8");
    }
}

public class dynamic_method_dispatch {
    public static void main(String[] args) {
        Nokia obj = new OnePlus();
        obj.greet();
        obj.name();
    }
}
