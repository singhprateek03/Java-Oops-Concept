//*************** problem 1 *****************
 class GoodMorning extends Thread{
    public void run(){
        int i = 1;
        while(i <= 20){
            System.out.println(i+". Good morning");
            i++;
        }
    }
}
class Welcome extends Thread{
    public void run(){
//        int i = 1;
//        while(i <= 20){
            //*********** problem 2 *************
//            try{
//                Thread.sleep(200);
//            }
//            catch(Exception e){
//                System.out.println(e);
//            }
            // **************************************
//            System.out.println(i+". Welcome");
//            i++;
//        }
    }
}
public class Chapter_13 {
    public static void main(String[] args) {
    GoodMorning gm = new GoodMorning();
    Welcome wc = new Welcome();
    // set priority
        gm.setPriority(5);
    // get priority
        System.out.println(gm.getPriority());
    // set priority
        wc.setPriority(10);
    // get priority
        System.out.println(wc.getPriority());
        // *************  problem 4 ****************
        // yeah thread ki state batata hai (NEW State)
        System.out.println(wc.getState());
    gm.start();
    wc.start();
    // yaha thread ki state change ho chuki hogi (NEW to RUNNABLE)
        System.out.println(wc.getState());

        // **************  problem 5 ***************
        // take reference of current thread
        System.out.println(Thread.currentThread().getState());
    }
}
