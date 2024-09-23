class Base{
    int x;
    public int getx(){
        return x;
    }

    public void setx(int x){
        this.x = x;
    }

    public void printMe(){
        System.out.println("I'm a constructor.");
    }
}

class Derived extends Base{
    int y;
    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y = y;
    }
}

public class Inheritance {
    public static void main(String[] args) {

        // Super class or parent class
        Derived myBase = new Derived();
        myBase.setx(10);
        System.out.println("The value of x is: "+myBase.getx());

        // Sub class or child class
//      Base myBase = new Base();
        myBase.setx(18);
        System.out.println("The value of x is: "+myBase.getx());
    }
}
