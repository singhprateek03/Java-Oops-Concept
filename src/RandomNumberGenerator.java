/* Create a class, which allows user to play "Guess the number game once". Game should have following methods:
1. Constructor to generate the random number
2. takeUserInput() to take a user input of number
3. isCorrectNumber() to detect whether the number entered by the user is true.
4. getter and setter for noOfGuesses
    use properties such as noOfGuesses(int), etc to get this task done!
*/

import java.util.Scanner;
import java.util.Random;
class game{
    public int a,b,c = 0;

    public int game(){
        Random random = new Random();
        a = random.nextInt(0,100);
        return a;
    }

    public void getUserInput(){
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Guess the number: ");
            b = sc.nextInt();
            if (a > b){
                System.out.println("Think for a bigger number.");
            }
            else if(a < b){
                System.out.println("Think for smaller number.");
            }
            c++;
        }
        while(a != b);
    }

    public void isCorrectNumber(){
        System.out.println("Correct guess.");
    }

    public void numberOfGuess(){
        System.out.println("Total number of guess: "+c);
        if (c <= 3){
            System.out.println("You are nice Player...");
        } else if (c > 3 && c < 7) {
            System.out.println("You are good player");
        }
        else {
            System.out.println("Nice try");
        }
    }
}
public class RandomNumberGenerator {
    public static void main(String[] args) {
        game player = new game();
        player.game();
        player.getUserInput();
        player.isCorrectNumber();
        player.numberOfGuess();
    }
}
