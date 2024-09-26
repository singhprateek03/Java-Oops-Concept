interface Bicycle{
    // a = 10 is a by default final
    int a = 10;
    // method
    void applyBreak(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
void peepee();
void poopoo();
}

class AtlasCycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("Poo Poo Poo Poo");
    }
    @Override
    // Jab hum interface ke method ko implment karte hai toh public banana padta hai
    public void applyBreak(int decrement){
        System.out.println("Apply break.");
    }
    @Override
    // Jab hum interface ke method ko implment karte hai toh public banana padta hai
    public void speedUp(int increment){
        System.out.println("Apply accelerate.");
    }
    @Override
    public void peepee(){
        System.out.println("pee pee pee pee");
    }
    @Override
    public void poopoo(){
        System.out.println("Poo poo poo poo");
    }
}
public class Interface {
    public static void main(String[] args) {
    AtlasCycle myCycle = new AtlasCycle();
    myCycle.applyBreak(1);
    // You can create properties in interface
    System.out.println(myCycle.a);

    /* You cannot modify the properties in interface as they are final
    myCycle.a = 20;
    System.out.println(myCycle.a);
     */
     myCycle.poopoo();
     myCycle.peepee();
    }
}
