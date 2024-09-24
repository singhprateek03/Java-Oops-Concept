class Phone{
    public void name(){
        System.out.println("Phone ON...");
    }
    public void ShowTime(){
        System.out.println("Time is showing...");
    }
}

class SmartPhone extends Phone{
    @Override
    public void name(){
        System.out.println("SmartPhone ON...");
    }
    public void music(){
        System.out.println("Playing music...");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
//    Phone obj = new Phone();      // Allowed
//    obj.name();

//    SmartPhone obj2 = new SmartPhone();   // Allowed
//    SmartPhone obj = new Phone();     // Not allowed

        // (Dynamic method dispatch) OR (Run time polymorphism)
      Phone obj = new SmartPhone();  // SmartPhone object hai toh jab hum obj.name se call karenge toh SmartPhone ki class ka method print hoga
        obj.ShowTime(); // Allowed
        obj.name(); // Allowed
//        obj.music();  // Not allowed
    }
}
