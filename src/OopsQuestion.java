class Employee{
    // Properties
    int salary;
    String name;

    // method
    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}

class CellPhone{
    public void ring(){
        System.out.println("Phone is ringing...");
    }

    public void vibrate(){
        System.out.println("Phone is Vibrating...");
    }

    public void call(){
        System.out.println("Calling to someone...");
    }

    public void music(){
        System.out.println("Listening music...");
    }
}

class Square{
    int side;
    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }
}

class Rectangle{
    int length, width;
    public int area(){
        return length*width;
    }

    public int perimeter(){
        return 2*length*width;
    }
}

class Circle{
    double radius;
    public double area(){
        return (3.14 * radius * radius);
    }

    public double perimeter(){
        return (2 * 3.14 * radius);
    }
}

class TommyGame{
    public void hit(){
        System.out.println("Hitting the enemy.");
    }

    public void run(){
        System.out.println("Running from the enemy.");
    }
    public void fire(){
        System.out.println("Fire on the enemy.");
    }
}

public class OopsQuestion {
    public static void main(String[] args) {
    // problem 1
//        Employee Prateek = new Employee();
//        Prateek.setName("Hey! Prateek.");
//        Prateek.salary = 80000;
//        System.out.println(Prateek.getName());
//        System.out.println(Prateek.salary);

        // Problem2
//        CellPhone android = new CellPhone();
//        android.ring();
//        android.vibrate();
//        android.call();
//        android.music();

        // Problem 3
//        Square sq = new Square();
//        sq.side = 3;
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());

        // Problem 4
//        Rectangle rect = new Rectangle();
//        rect.length = 6;
//        rect.width = 4;
//        System.out.println(rect.area());
//        System.out.println(rect.perimeter());

        // problem 5
        TommyGame Tom = new TommyGame();
        Tom.hit();
        Tom.fire();
        Tom.run();

        // Problem 6
//        Circle cir = new Circle();
//        cir.radius = 5;
//        System.out.println(cir.area());
//        System.out.println(cir.perimeter());
    }
}
