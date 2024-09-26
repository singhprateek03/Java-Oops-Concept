// Abstract class
abstract class Parent{
    // Constructor
    public Parent(){
        System.out.println("I'm a constructor of base class.");
    }
    //method
    public void Hello(){
        System.out.println("Hello");
    }
    // abstract method
    abstract public void greet();
    abstract public void greet2();
}

abstract class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
}

class Child2 extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }

    public void greet2(){
        System.out.println("Good Afternoon");
    }
}

public class AbstractMethod {
    public static void main(String[] args) {
//    Parent p = new Parent();   // error (because abstract class ka object nhi bana sakte)
//    Child c = new Child();    // error
        Child2 ch = new Child2();
    }
}
