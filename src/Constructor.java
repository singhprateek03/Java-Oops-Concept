class MyMainEmployee{
    private int id;
    private String name;

    // Default Constructor declaration
//    public MyMainEmployee(){
//        id = 45;
//        name = "Name of the user.";
//    }

    // Parameterized Constructor declaration
    public MyMainEmployee(int myId, String myName){
        id = myId;
        name = myName;
    }
    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = n;
    }

    public int getId(){
        return id;
    }

    public void setId(int i){
        this.id = i;
    }
}

public class Constructor {
    public static void main(String[] args) {
        MyMainEmployee prateek = new MyMainEmployee(102,"Prateek Programmer.");
//        prateek.setName("Hello Prateek,");
//        prateek.setId(102);
        System.out.println(prateek.getName());
        System.out.println(prateek.getId());

    }
}
