public class Driver {
    static int minAgeForDriving = 18;

    // Non Static methods
    String name;
    int age;
    String dateOfLicense;

    public boolean isAllowedToDrive(){
        return this.age >=minAgeForDriving;     // minAgeForDriving -> yeah static method hai
    }

    public static void main(String[] args) {
        Car myCar = new Car();
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelLevel());
//        myCar.addFuel(10);
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelLevel());

        Car swift = new Car();
        swift.addFuel(6);
        swift.start().drive();

        Driver myDriver = new Driver();
        myDriver.dateOfLicense = "01/Oct/2024";
    }
}
