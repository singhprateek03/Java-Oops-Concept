interface MyCamera{
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

interface Mywifi{
    // String method
    String[] getNetwork();
    void connectToNetwork(String network);
}

// class
class MyCellPhone{
    // method
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    // method
    void PickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements Mywifi, MyCamera{
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
public class DefaultMethod {
    public static void main(String[] args) {
    MySmartPhone myObj = new MySmartPhone();
    // default method calling
    myObj.record4KVideo();

    // private method calling
//    myObj.greet();    // throw error because we are trying to access private method directly
    String[] ar = myObj.getNetwork();
    // for each loop
        for (String item: ar){
            System.out.println(item);
        }
    }
}
