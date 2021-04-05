package Lectures;

public class Methods_MethodsOverloading {

    // static void name(String a){ // String a ====> Parameter
    // System.out.println("Hello " + a + ", How are you?");
    // }
    // public static void main(String[] args) {
    // // Methods and Functions are the samething with different name.
    // //Methods are called in Java whereas Functions are called in other
    // programming languages.

    // name("MoviKamal"); // Movikamal ===> Argument
    // }

    // static void sum (int a, int b){
    // int c = a +b;
    // System.out.println("The result is:\t" + c);
    // }

    // public static void main(String[] args) {
    // Scanner inp = new Scanner(System.in);
    // System.out.println("Enter a number");
    // int x = inp.nextInt();
    // System.out.println("Enter another number");
    // int y= inp.nextInt();

    // sum(x,y);
    // }

    // static void sum (int x, int y){
    // x = 98;
    // y = 20;
    // int c = x + y;
    // System.out.println(c);
    // }

    // public static void main(String[] args) {
    // int x = 10;
    // int y = 20;
    // sum(x,y);
    // }

    // void sum (int x, int y){
    // int c = x + y;
    // System.out.println(c);
    // }

    // public static void main(String[] args) {
    // Methods_MethodsOverloading sumObject = new Methods_MethodsOverloading();
    // sumObject.sum(8, 9);
    // }

    // Method Overloading
    // static void TellMeAQuote (){
    // System.out.println("Honesty is the best policy.");
    // }

    // public static void main(String[] args) {
    // TellMeAQuote();
    // }

    // static void meth(int arr[]){
    // arr[0] = 75;
    // }

    // public static void main(String[] args) {
    // int marks[] = {100,78,98,56,85,25,34};
    // meth(marks);
    // System.out.println(marks[0]);
    // }

    // static void printNumber(int x){
    // x = 10;
    // }

    // public static void main(String[] args) {
    // int a = 8;
    // printNumber(a); // int x = 8;
    // System.out.println(a);
    // }

    static void foo(){
        System.out.println("Hello!");
    }

    static void foo(String name1){
        System.out.println("Hello! " + name1);
    }

    static void foo(String name1, String name2){
        System.out.println("Hello! " + name1);
        System.out.println("hello! " + name2);
    }
    public static void main(String[] args) {
        foo();
        foo("Kamal");
        foo("Kamal", "Gulabo");
    }
}