class MyThr1 extends Thread{
    public MyThr1(String name) {
        super(name);
    }

    public void run(){
        System.out.println("Java "+this.getName());
    }
}
public class ThreadPriorities {
    public static void main(String[] args) {
    MyThr1 t1 = new MyThr1("Java");
    MyThr1 t2 = new MyThr1("AI");
    MyThr1 t3 = new MyThr1("ML");
    MyThr1 t4 = new MyThr1("Python");
    MyThr1 t5 = new MyThr1("Web Tech");
    // t5 ki max priority ho jayegi ab sabse yeah print hoga
    t5.setPriority(Thread.MAX_PRIORITY);
    // Min priority
    t1.setPriority(Thread.MIN_PRIORITY);
    t2.setPriority(Thread.MIN_PRIORITY);
    t3.setPriority(Thread.MIN_PRIORITY);
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    }
}
