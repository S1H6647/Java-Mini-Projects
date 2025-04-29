import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userInput = 0;
        Random ran = new Random();
        int value = ran.nextInt(1, 501);
        System.out.println(value);

        Scanner input = new Scanner(System.in);
        while (userInput != value) {
            System.out.print("Guess the number between 0 to 500: ");
            if (input.hasNextInt()) {
                userInput = (input.nextInt());
                if (userInput < 0) {
                    System.out.println("Invalid. Input less than 0");
                } else if (userInput > 500) {
                    System.out.println("Invalid. Input more than 500");
                } else {
                    if (userInput < value){
                        System.out.println("Guess higher");
                    }
                    else if (userInput > value){
                        System.out.println("Guess Lower");
                    }
                    if (userInput == value) {
                        System.out.println("Correct guess. The number was " + value);
                        System.out.print("Do you want to continue? ");
                        String choice = input.next().toUpperCase();

                        if (choice.matches("YES") || choice.matches("Y")) {
                            value = ran.nextInt(1, 501);
                            System.out.println(value);
                        }
                        else {
                            System.out.println("Exiting...");
                        }
                    } else {
                        System.out.println("Try again");
                    }
                }
            } else {
                System.out.println("Input only integers");
                input.next();
            }
        }
        input.close();
    }
}