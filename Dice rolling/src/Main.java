import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numOfDice, total = 0;
        Scanner input = new Scanner(System.in);
        Random ran = new Random();

        System.out.print("Enter how many times do you want to roll the dice: ");
        numOfDice = input.nextInt();
        if (numOfDice > 0) {
            for (int i = 1; i <= numOfDice; i++) {
                int roll = ran.nextInt(1, 7);
                printDice(roll);
                System.out.println("You rolled " + roll);
                total += roll;
            }
            System.out.println("Total = " + total);
        } else {
            System.out.println("0 times rolled");
        }
        input.close();
    }

    static void printDice(int roll){
        String dice1 = """
                ---------
                |       |
                |   •   |
                |       |
                ---------
                """;

        String dice2 = """
                ---------
                | •     |
                |       |
                |     • |
                ---------
                """;

        String dice3 = """
                ---------
                | •     |
                |   •   |
                |     • |
                ---------
                """;

        String dice4 = """
                ---------
                | •   • |
                |       |
                | •   • |
                ---------
                """;

        String dice5 = """
                ---------
                | •   • |
                |   •   |
                | •   • |
                ---------
                """;

        String dice6 = """
                ---------
                | •   • |
                | •   • |
                | •   • |
                ---------
                """;

        switch (roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.println("Invalid Option!");
        }
    }
}