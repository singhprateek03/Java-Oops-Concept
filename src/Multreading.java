class MyThread1 extends Thread{
@Override
    public void run(){
    int i = 0;
    while(1 <= 10) {
        System.out.println("My thread is running");
        System.out.println("I'm happy.");
        i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i <= 10) {
            System.out.println("My thread is running");
            System.out.println("I'm sad.");
            i++;
        }
    }
}
public class Multreading {
    public static void main(String[] args) {
    MyThread1 t1 = new MyThread1();
    MyThread2 t2 = new MyThread2();
    //thread start
    t1.start();
    t2.start();
    }
}
