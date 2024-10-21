interface DemoAnony{
    void meth1();
//    void meth2();
}

//class Func implements DemoAnony{
//    @Override
//    public void meth1(){
//        System.out.println("I'm Overridden method 1");
//    }
//}

//class AnonyDemo implements DemoAnony {
//    @Override
//    public void meth1() {
//        System.out.println("I'm meth1.");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("I'm meth2.");
//    }
//}

public class Lambda{
    public static void main(String[] args) {
//    DemoAnony ad = new AnonyDemo();
//    ad.meth1();
//    ad.meth2();

        /* Anonymous class */
//        DemoAnony obj = new DemoAnony(){    // DemoAnony() -> Interface reference
//            @Override
//            public void meth1(){
//                System.out.println("I'm method 1");
//            }
//            @Override
//            public void meth2(){
//                System.out.println("I'm method 2");
////            }
//        };
//        obj.meth1();
//        obj.meth2();

        // ************** Anonymous class end ***************

        /* Lambda Expression */
//        DemoAnony obj = new Func();
//        obj.meth1();

        DemoAnony obj = () ->{
            System.out.println("I'm method 1 from Lambda Expression.");
        };
        obj.meth1();
    }
}
