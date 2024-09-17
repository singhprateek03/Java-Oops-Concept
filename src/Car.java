public class Car {
    static int noOfCarsSold;
    // Instance Variable
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiter;
    int noOfSeats;

    // Default Constructor declaration
//    Car(String color){
//        noOfWheels = 4;
//        color = "Black";
//        maxSpeed = 150;
//        currentFuelInLiter = 4;
//        noOfSeats = 5;
//    }

    // Parameterized Constructor declaration
    Car(String color){      // iss color ko priority mil rahi hai
        noOfWheels = 4;
        this.color = color;     // object color ki priority ko badhne ke liye this keyword ka use kiya hai
        maxSpeed = 150;
        currentFuelInLiter = 4;
        noOfSeats = 5;
    }

    // Constructor Chaining
    Car(){
        this("Black");  // yeah esa constructor dhundhega jo Car() class main color leta ho user se or uss main black color pass karna chahte ho
    }
    public Car start(){
        if (currentFuelInLiter == 0){
            System.out.println("Car is out of fuel, cannot start");
        }
        else if (currentFuelInLiter < 5){
            System.out.println("Car is in reserved mode, please refuel...");
            currentFuelInLiter--;
        }else {
            System.out.println("Car is started...");
        }
        return this;    // this -> It is used to return reference of current class.
    }

    public void drive(){
    currentFuelInLiter--;
        System.out.println("Car is driving");
    }

    public void addFuel(float fuel){
        currentFuelInLiter += fuel;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiter;
    }
}
