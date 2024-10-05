class MyThread extends Thread{
    //Constructor declaration
    public MyThread(String name){
        super(name);
    }

    public void run(){
        System.out.println("Java");
//        while(true){
//            System.out.println("I'm a thread");
//        }
    }
}

public class ThreadConstructor {
    public static void main(String[] args) {
    MyThread t1 = new MyThread("Java");
    MyThread t2 = new MyThread("Python");
    // Thread start
    t1.start();
    t2.start();
    // First Thread ID
        System.out.println("ID of thread is: " +t1.getId());
    // First Thread Name
        System.out.println("Name of the thread is: "+t1.getName());
        // Second Thread ID
        System.out.println("ID of thread is: " +t2.getId());
        // Second Thread Name
        System.out.println("Name of the thread is: "+t2.getName());
    }
}