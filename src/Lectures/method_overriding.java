package Lectures;

class A{
    public void meth1(){
        System.out.println("I am a method 1 of class A");
    }
}

class B extends A{
    @Override
    public void meth1(){
        System.out.println("I am a method 1 of class B");
    }
    public void meth2(){
        System.out.println("I am a method 2 of class B");
    }
}

public class method_overriding {
    public static void main(String[] args) {
        B objB = new B();
        objB.meth1();
        objB.meth2();

        A objA = new A();
        objA.meth1();
    }
}
