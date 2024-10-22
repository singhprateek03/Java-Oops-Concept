import java.util.Scanner;

class ATM {
    float Balance;
    int PIN = 0000;

    public void checkPin() {
        System.out.println("Enter you PIN: ");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        if (enteredPin == PIN) {
            menu();
        } else {
            System.out.println("Wrong Pin entered...❌");
        }
    }

    public void menu(){
        System.out.println("Enter your choice: ");
        System.out.println("1. Check A/C balance");
        System.out.println("2. Withdraw money");
        System.out.println("3. Deposit money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if (opt == 1){
            checkBalance();
        }
        else if (opt == 2) {
            withdraw();
        }
        else if(opt == 3){
            deposit();
        }
        else if (opt == 4) {
            return;
        }
        else{
            System.out.println("Invalid Choice!");
        }
    }

    // checkBalanace() method
    public void checkBalance(){
        System.out.println("Balance: "+Balance);
        menu();
    }

    // withdraw() method
    public void withdraw(){
        System.out.print("Enter amount to withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount <= Balance) {
            Balance -= amount;
            System.out.println("Money withdraw successfully ");
        }
        else{
            System.out.println("Insufficient balance");
        }
        menu();
    }

    // deposite() method
    public void deposit(){
        System.out.println("Enter amount to deposit: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance += amount;
        System.out.println("Money deposit successfully");
        menu();
    }

    // EXIT() method

}

public class ATMMachine {
    public static void main(String[] args) {
    ATM obj = new ATM();
    obj.checkPin();
    }
}
