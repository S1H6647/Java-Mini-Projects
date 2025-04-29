import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int principal;
        double rate;
        int compoundTime;
        int time;
        double CI;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter principle amount: ");
        principal = input.nextInt();
        System.out.print("Enter annual interest rate (in %): ");
        rate = input.nextDouble() / 100;
        System.out.print("Enter the number of compounding periods: ");
        compoundTime = input.nextInt();
        System.out.print("Enter time (expressed in years): ");
        time = input.nextInt();

        input.close();

        CI = principal * (Math.pow(1+ (rate / compoundTime),compoundTime*time));

        System.out.printf("Compound Interest for provided details after %d years is Rs.%,.2f",time,CI);
    }
}