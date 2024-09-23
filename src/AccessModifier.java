class MyEmployee{
    private int id;
    private String name;

    // Getter
    public String getName(){
        return name;
    }
    // Setter
    public void setName(String n){
        this.name = n;
    }
    // Getter
    public int getId(){
        return id;
    }
    // Setter
    public void setId(int i){
        this.id = i;
    }
}


class circle1{
    private int radius;
    private float area;
    private float perimeter;

    public void setRadius(int r){
        radius = r;
    }

    public void checkArea(float a){
        area = 3.14f * radius * radius;
        if (area == a){
            System.out.println("Correct area.");
        }
        else{
            System.out.println("Incorrect area.");
        }
    }
    public void setPerimeter(float p){
        perimeter = 2 * 3.14f * radius;
        if (perimeter == p){
            System.out.println("Correct perimeter.");
        }
        else{
            System.out.println("Incorrect perimeter.");
        }
    }
}

class AccessModifierPratice {
    public static void main(String[] args) {
        MyEmployee prateek = new MyEmployee();

//        prateek.id = 101;     // They throw an error due to private access modifier
//        prateek.name = "Hey Prateek, have a good day!";

        prateek.setName("Hey Prateek, have a good day!");
        System.out.println(prateek.getName());
        prateek.setId(101);
        System.out.println(prateek.getId());

//        circle1 ci = new circle1();
//        ci.setRadius(5);
//        ci.checkArea(78.5f);
//        ci.setPerimeter(31.4f);
    }
}