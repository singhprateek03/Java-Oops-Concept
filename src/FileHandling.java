import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        // Creating file
        File myFile = new File("Hello.txt");
        try {
            myFile.createNewFile();
        }
        catch (IOException e){
            System.out.println("Unable to create this file!!!");
            e.printStackTrace();
        }

        // Code to write to a file
        try {
            FileWriter fileWriter = new FileWriter("Hello.txt");
            fileWriter.write("This is our first File Handling program...");
            fileWriter.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        //Reading a file
        File myFile2 = new File("Hello.txt");
        try{
        Scanner sc = new Scanner(myFile2);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        // Deleting a file
        File myFile3 = new File("Hello.txt");
        if (myFile3.delete()){
            System.out.println("Deleted successfully: "+myFile3.getName());
        }
        else{
            System.out.println("File in not available");
        }
    }
}
