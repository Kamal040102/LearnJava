package Lectures;

class LearnConstructors{
    private int id;
    private String name;

    public LearnConstructors(String myname){
        id = 45;
        name = myname;
    }
    public LearnConstructors(String myname, int myid){
        id = myid;
        name = myname;
    }
    
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

}

public class constructors {
    public static void main(String[] args) {
        LearnConstructors obj = new LearnConstructors("Kamal Sharma", 5);
        LearnConstructors obj1 = new LearnConstructors("Gulabo Sharma", 2);
        // obj.setId(1);
        // obj.setName("Kamal Sharma");
        // System.out.println(obj.getId());
        // System.out.println(obj.getName());
        // System.out.println(obj.getId());
        System.out.println(obj.getName());
        System.out.println(obj.getId());
        System.out.println(obj1.getName());
        System.out.println(obj1.getId());
    }
}
