class Base1{
    // Constructor declaration
    Base1(){
        System.out.println("I'm a Constructor.");
    }

    // Constructor take integer arguments
    Base1(int x){
        System.out.println("I'm a overloaded Constructor with the value of x: "+x);
    }
}

class Derived1 extends Base1{
   // Constructor declaration
    Derived1(){
    //  super(0);      // yeah class Base1(int x) ko call karega
        System.out.println("I'm a derived Constructor.");
    }

    //Overload constructor
    Derived1(int x, int y){
        super(x);
        System.out.println("I'm a overloaded constructor of derived with the value of y: "+y);
    }
}

class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I'm a child of derived Constructor.");
    }

    // Overload Constructor
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I'm a overloaded constructor of derived with the value of z: "+z);
    }
}

public class ConstructorInInheritence {
    public static void main(String[] args) {
//    Base1 myBase = new Base1();
//    Derived1 myDerived = new Derived1();    // Yeah Base1 class ke constructor ko call kar rha hai

        // **** If we passed argument in the constructor ****
//        Derived1 myDerived = new Derived1(10,15);

        // **** This will used for without arguments ****
//        ChildOfDerived myChildOfDerived = new ChildOfDerived();

        // **** This will used for with arguments ****
        ChildOfDerived myChildOfDerived = new ChildOfDerived(10,20,30);
    }
}
