import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 60;
        marks[1] = 65;
        marks[2] = 55;
        Scanner sc= new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("Enter the value of index: ");
            int index = sc.nextInt();
            try {
                System.out.println("Welcome to Nested Try-catch...");
                try {
                    System.out.println(marks[index]);
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry, this index doesn't exists.");
                    System.out.println("Exception level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception level 1");
            }
        }
    }
}
