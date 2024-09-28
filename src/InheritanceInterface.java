interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface{
    // Definition iss liye di hai kyu ki hum class main interface ko implement kar rhe hai

    // Definition of meth1
    public void meth1(){
        System.out.println("Method 1");
    }
    // Definition of meth2
    public void meth2(){
        System.out.println("Method 2");
    }
    // Definition of meth3
    public void meth3(){
        System.out.println("Method 3");
    }
    // Definition of meth3
    public void meth4(){
        System.out.println("Method 4");
    }
}
public class InheritanceInterface {
    public static void main(String[] args) {
    MySampleClass obj = new MySampleClass();
    obj.meth1();
    obj.meth2();
    obj.meth3();
    obj.meth4();
    }
}
