package Lectures;

class myEmployees{
    private int id;
    private String name;

    public void setId(int x){
        this.id = x;
    }
    public int getId(){
        return id;
    }

    public void setName(String y){
        this.name = y;
    }
    public String getName(){
        return name;
    }
}

public class getters_setters {
    public static void main(String[] args) {
        myEmployees kamal = new myEmployees();
        kamal.setId(1);
        kamal.setName("Kamal Sharma");
        System.out.println(kamal.getId());
        System.out.println(kamal.getName());
        
        myEmployees gulabo = new myEmployees();
        gulabo.setId(2);
        gulabo.setName("Gulabo Sharma");
        System.out.println(gulabo.getId());
        System.out.println(gulabo.getName());
    }
}
