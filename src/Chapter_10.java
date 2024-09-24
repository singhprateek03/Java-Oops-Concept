class Circle1{
    public int radius;

    // Parameterized Constructor
    Circle1(int radius){
        System.out.println("I'm a Circle");
        this.radius = radius;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
}
class Cylinder1 extends Circle1{
    public int height;
    // Parameterized Constructor
    Cylinder1(int radius, int height){
        super(radius);  // super calls to superclass (parent class) for radius
        System.out.println("I'm a Cylinder");
        this.height = height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
}

class Rectangle1{
    public int length;
    public int width;

    public void length(int length){
        this.length = length;
    }

   public void width(int width){
    this.width = width;
   }

   // Parameterized constructor
   Rectangle1(int length, int width){
        this.length = length;
        this.width = width;
   }
   public float area(){
        return length * width;
   }
}

class Cuboid extends Rectangle1{
    public int breadth, height;

    // Parameterized constructor
    Cuboid(int length, int breadth, int height) {
        super(length, breadth); // superclass main jitni bhi method bana rakhe hai super method main sabko call karna compulsary hai
        this.breadth = breadth;
        this.height = height;
    }

    public double volume(){
        return length * breadth * height;
    }
}

public class Chapter_10 {
    public static void main(String[] args) {
        // Problem 1
//        Circle1 myObj = new Circle1(12);
//        System.out.println("Area of circle: "+myObj.area());
//        Cylinder1 myObj1 = new Cylinder1(12, 5);
//        System.out.println("Volume of Cylinder is: "+myObj1.volume());

        // Problem 2
        Rectangle1 myRect = new Rectangle1(10, 20);
        System.out.println("Area of rectangle is: " + myRect.area());

        Cuboid myCub = new Cuboid(10,5,12);
        System.out.println("Volume of cuboid is: "+myCub.volume());
    }
}
