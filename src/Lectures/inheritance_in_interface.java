package Lectures;

interface sampleInterface{
    void meth1();
    void meth2();
}

interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}

class sampleClass implements childSampleInterface{
    @Override
    public void meth1() {
        // TODO Auto-generated method stub
        System.out.println("I am meth-1 of interface sampleInterface");
    }

    @Override
    public void meth2() {
        // TODO Auto-generated method stub
        System.out.println("I am meth-2 of interface sampleInterface");
    }

    @Override
    public void meth3() {
        // TODO Auto-generated method stub
        System.out.println("I am meth-3 of interface childSampleInterface");
    }

    @Override
    public void meth4() {
        // TODO Auto-generated method stub
        System.out.println("I am meth-4 of interface childSampleInterface");
    }
}

public class inheritance_in_interface {
    public static void main(String[] args) {
        sampleClass sc = new sampleClass();
        sc.meth1();
        sc.meth2();
        sc.meth3();
        sc.meth4();
    }
}
