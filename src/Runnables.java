class MyThreadRunnable1 implements Runnable {
    public void run(){
        int i = 0;
        while(i <10) {
        System.out.println("I'm a thread 1 not a threat 1.");
        i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable {
    public void run(){
        int i = 0;
        while(i <10) {
        System.out.println("I'm a thread 2 not a threat 2.");
        i++;
        }
    }
}
public class Runnables {
    public static void main(String[] args) {
    MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
    //Thread creating
    Thread gun1 = new Thread(bullet1);

    MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
    //Thread creating
    Thread gun2 = new Thread(bullet2);
    // Thread start
        gun1.start();
        gun2.start();
    }
}
