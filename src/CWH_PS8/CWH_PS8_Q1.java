package CWH_PS8;

class Employee{
    int Salary;
    public int getSalray(){
        return Salary * 1000;
    }
    String name;
    public String getName(){
        return name;
    }
    public String setName(String x){
        name = x;
        return name;
    }

}

public class CWH_PS8_Q1 {
    public static void main(String[] args) {

        // for object Kamal
        Employee kamal = new Employee();
        kamal.name="Kamal Sharma";
        System.out.println("Employee Name: "+kamal.getName());
        kamal.Salary = 20;
        System.out.println("Salary of " + kamal.name + " is "+kamal.getSalray());
        kamal.setName("Sharma Kamal");
        System.out.println("New Name: "+kamal.name);


        System.out.println("");
        //for object gulabo
        Employee gulabo = new Employee();
        gulabo.name="Gulabo Sharma";
        System.out.println("Employee Name: "+gulabo.getName());
        gulabo.Salary = 10;
        System.out.println("Salary of " + gulabo.name + " is "+gulabo.getSalray());
        gulabo.setName("Sharma Gulabo");
        System.out.println("New Name: "+gulabo.name);
    }
}
