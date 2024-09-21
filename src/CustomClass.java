// Custom class
class Employee1{
    int id;
    String name;
    int salary;
    // Method declaration inside a class
    public void printDetails(){
        System.out.println("My id is: "+id);
        System.out.println("My name is: "+name);
        System.out.println("Salary is: "+salary);
    }
}
public class CustomClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 Alex = new Employee1(); // Instantiating a new Employee object
        Employee1 Mike = new Employee1();

        // setting attributes for Alex
        Alex.id = 101;
        Alex.name = "Alex Hardson";
        Alex.salary = 1000;

        // Setting attributes for Mike
        Mike.id = 102;
        Mike.name = "Mike Peterson";
        Mike.salary = 1500;

        // Alex is object, Object ka Method call
        Alex.printDetails();
//        System.out.println(Alex.id);
//        System.out.println(Alex.name);
        Mike.printDetails();
    }
}
