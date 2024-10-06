class MyNewThread1 extends Thread{
    public void run(){
        int i =1;
        while(i<=10) {
            // 2. sleep thread method
            try {
                Thread.sleep(400);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(i+". Java");
        i++;
        }
    }
}

class MyNewThread2 extends Thread{
      public void run(){
          int i =1;
        while(i<=10){
            System.out.println(i+". I'm a thread");
            i++;
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
    MyNewThread1 t1 = new MyNewThread1();
    MyNewThread2 t2 = new MyNewThread2();
    t1.start();
    // join thread method -> jab tak t1 khatam nhi hoga tab tak t2 start nhi hoga
    // yeah Exception throw karega isi liye isse humne try, catch ke andar rakha hai
        // 1. join method
//    try{
//        t1.join();
//    }
//    catch(Exception e){
//        System.out.println(e);
//    }
    t2.start();
    }
}
