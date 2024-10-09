import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 50;
        marks[1] = 60;
        marks[2] = 55;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index: ");
        int index = sc.nextInt();

        System.out.println("Enter the value you want to divide the value with: ");
        int number = sc.nextInt();
        try {
            System.out.println("The value of the array index entered is: "+marks[index]);
            System.out.println("The value of the array-value/number is: "+marks[index]/number);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException occurred!");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurred!");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Some other Exception occurred!");
            System.out.println(e);
        }
    }
}
