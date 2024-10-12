import java.util.Scanner;

public class Chapter_14 {
    public static void main(String[] args) {
        // **** problem 1 (WAP in java to demonstrate syntax, logical and runtime error) ****
        /* logical error */
//        int a = 10
//        int b = 20;
//        System.out.println("The sum of a and b is: "+(a+b));

        /* runtime error (Exception) */
//        try {
//            int a = 10;
//            int b = 0;
//            System.out.println("The division of a and b is: " + (a / b));
//        }
//        catch(Exception e){
//            System.out.println("Exception occured!\n"+e);
//        }
//        System.out.println("Exception Handled");
        /* ********************************************************** */

       // **** problem 2 (WAP in java to that print "HAHA" during ArithmeticException and "HEHE" during IllegalArgumentException)****
//        try {
//            int a = 666;
//            int b = 9;
//            System.out.println(a / b);
//        }
//        /* IllegalArgumentException */
//        catch (IllegalArgumentException e){
//            System.out.println("Hehe IllegalAccessException\n"+e);
//        }
//        /* ArithmeticException */
//        catch (ArithmeticException e){
//            System.out.println("Haha ArithmeticException\n"+e);
//        }

        /* ******************************************************** */

        /* problem 3 (WAP in java that allows you to keep accessing an array until a valid index is given. If max retries exceed 5 print "error".) */
//        boolean flag = true;
//        int[] marks = new int[3];
//        marks[0] = 70;
//        marks[1] = 56;
//        marks[2] = 50;
//        Scanner sc = new Scanner(System.in);
//        int index;
//        int i = 0;
//        while(flag && i < 5){
//            try {
//                System.out.print("Enter the valid index: ");
//                index = sc.nextInt();
//                System.out.println("The value of marks[index] is: " + marks[index]);
//                break;
//            }
//            catch(Exception e){
//                System.out.println("Invalid index!");
//                i++;
//                System.out.println(e);
//            }
//        }
//        if (i<=5){
//            System.out.println("Error");
//        }
        /* ****************************************************************** */

        /* problem 4 (Modify problem 3 to throw a custom Exception if max retries and reached) */
        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 70;
        marks[1] = 56;
        marks[2] = 50;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while(flag && i < 5){
            try {
                System.out.print("Enter the valid index: ");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is: " + marks[index]);
                break;
            }
            catch(Exception e){
                System.out.println("Invalid index!");
                i++;
                System.out.println(e);
            }
        }
        if (i<=5){
            System.out.println("Error");
        }
    }
}