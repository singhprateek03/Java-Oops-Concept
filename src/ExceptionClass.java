import java.util.Scanner;

    // user defined Exception class
    class MyException extends Exception{
    // toString() -> predefined method in Exception class
    @Override
    public String toString(){
        return "I'm a toString()";
    }
    // getMessage() -> predefined method in Exception class
    @Override
    public String getMessage(){
        return "I'm a getMessage()";
    }
}
public class ExceptionClass {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the value of a: ");
        a = sc.nextInt();
        if (a<=10){
            try{
                // Custom Exception or User-defined Exception
//                throw new MyException();
                throw new ArithmeticException("This is an Exception");
             }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                // printStackTrace(); -> yeah method batata hai ki konsa error, konsi line main aa rha hai
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes finished");
        }
    }
}
