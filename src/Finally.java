public class Finally {
    public static int greet(){
        try{
            int a = 10;
            int b = 2;
            int c = a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        // Exception aaye chache naa aaye finally method chalega hee chalega
        finally {
            System.out.println("End of the greet method.");
        }
        return 0;
    }
    public static void main(String[] args) {
       int c = greet();
        System.out.println(c);

        int a = 10;
        int b = 5;
        while (true) {
            try {
                System.out.print("Divide of a and b is: "+(a/b));
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("\nvalue of b = "+b);
            }
            b--;
        }
    }
}
