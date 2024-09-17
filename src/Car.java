public class Car {
    // Instance Variable
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiter;
    int noOfSeats;

    // Parameterized Constructor declaration
    Car(String color){      // iss color ko priority mil rahi hai
        noOfWheels = 4;
        this.color = color;     // object color ki priority ko badhne ke liye this keyword ka use kiya hai
        maxSpeed = 150;
        currentFuelInLiter = 4;
        noOfSeats = 5;
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
