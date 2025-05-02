import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static double balance = 0.0;
    public static double amount;
    public static void main(String[] args) {
        byte choice;
        boolean isRunning = true;


        while (isRunning) {
            System.out.println("***********************");
            System.out.println("* Banking Application *");
            System.out.println("***********************");

            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("(1-4) => ");
            choice = input.nextByte();

            switch (choice) {
                case 1 -> showBalance();
                case 2 -> deposit();
                case 3 -> withdraw();
                case 4 -> {
                    System.out.println("Exiting...");
                    isRunning = false;
                }
                default -> System.out.println("Invalid option!");
            }
        }
        input.close();
    }

    static void showBalance(){
        System.out.printf("Your balance is Rs. %.2f\n", balance);
    }
    static void deposit(){
        System.out.println("Enter the amount you want to deposit: ");
        System.out.print("=> ");
        balance += input.nextDouble();
        if (amount < 0){
            System.out.println("Amount can not be in negative!");
        } else {
            System.out.printf("Successfully deposited %.2f\n", balance);
        }
    }

    static void withdraw(){
        System.out.println("How much cash do you want to withdraw? ");
        System.out.print("=> ");
        amount = input.nextDouble();
        if (amount > balance){
            System.out.println("Insufficient balance!");
        } else if (amount < 0){
            System.out.println("Amount can not be in negative!");
        } else {
            System.out.printf("Rs. %.2f successfully withdrawn! Your current balance is Rs. %.2f\n",amount, (balance - amount));
        }
    }
}