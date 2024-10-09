public class TryCatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        // without try
//        float c = a/b;
//        System.out.println("The result is: "+c);

        // with try
        try{
            float c = a/b;
            System.out.println("The result is: "+c);
        }
        catch(Exception e) {
            System.out.println("We failed to divide.\nReason: ");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
