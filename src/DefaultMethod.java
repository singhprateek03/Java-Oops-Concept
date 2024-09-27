interface MyCamera{
    void takeSnap();
    void recordVideo();
}

interface Mywifi{
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
class MySmartPhone extends MyCellPhone implements MyCamera, Mywifi{
    public void TakeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }
    public String[] getNetwork(){
        System.out.println("Getting list of network");
        String[] networkList = {"Alex", "Mike", "Peter", "Henrry"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
}
public class DefaultMethod {
    public static void main(String[] args) {

    }
}
