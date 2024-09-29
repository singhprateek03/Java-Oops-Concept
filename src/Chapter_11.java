// abstract class
abstract class pen{
    // abstract method
    abstract void write();
    abstract void refill();
}
class FountainPen extends pen{
    @Override
    void write() {
        System.out.println("Pen is writing.");
    }

    @Override
    void refill() {
        System.out.println("Pen is refilled.");
    }

    void changeNib(){
        System.out.println("Changing nib of the pen.");
    }
}

class Monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hey! How are you ?");
    }

    @Override
    public void eat(){
        System.out.println("Eating");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping");
    }
}

public class Chapter_11 {
    public static void main(String[] args) {
        // Problem 1 and 2
//    FountainPen pen = new FountainPen();
//    pen.changeNib();
//    pen.write();
//    pen.refill();

        // Problem 3
//        Human human = new Human();
//        human.eat();
//        human.sleep();
//        human.speak();
//        human.jump();
//        human.bite();

        // Problem 5
        Monkey monkey = new Human();
        // Only these 2 methods are valid because these methods are available in Monkey() method.
        monkey.jump();
        monkey.bite();
//        money.eat();  -> throws error because outside of Monkey method we are trying to call outside of method
    }
}
