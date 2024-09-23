class A{
    public int a;
    public int myInt(){
        return 4;
    }
    public void meth2(){
        System.out.println("I'm method2 of class A.");
    }
}

class B extends A{
    @Override   // Override annotation -> (It is optional) yeah bata hai ki method override ho rha hai
    public void meth2(){
        System.out.println("I'm method 2 of class B");
    }
    public void meth3(){
        System.out.println("I'm method 3 of class B");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
    A a = new A();
    a.meth2();
    }
}
