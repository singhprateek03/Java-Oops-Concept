interface MyCamera2{
    void takeSnap();
    void recordVideo();
    // private method
    private void greet(){
        System.out.println("Hey, How are you ?");
    }
    // Default method
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4K...");
    }
}

interface Mywifi2{
    // String method
    String[] getNetwork();
    void connectToNetwork(String network);
}

// class
class MyCellPhone2{
    // method
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    // method
    void PickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements Mywifi2, MyCamera2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }

    public void recordVideo(){
        System.out.println("Recording video");
    }

//    @Override // default method ko override kar rha hai
//    public void record4KVideo(){
//        System.out.println("Recording video in 4k...");
//    }

    public String[] getNetwork(){
        System.out.println("Getting list of network: ");
        String[] networkList = {"Alex", "Mike", "Peter", "Henry"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam1 = new MySmartPhone2();   // This is a smartphone, but use it as a camera.
        // these all methods are in MyCamera2() method, all methods are accessible.
        cam1.takeSnap();
        cam1.record4KVideo();
        cam1.recordVideo();

        // yeah humare fyade ke liye banaya jaata hai taaki user ek method ke bahar ka data ko access naa kar sake.
//        cam1.getNetwork();  --> thorw error
    }
}
