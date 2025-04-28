import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double num1;
        double num2;
        String operator;

        Scanner input = new Scanner(System.in);

        System.out.println("   Calculator   ");
        System.out.println("----------------");

        //! 1st Number
        System.out.print("Enter 1st number: ");
        num1 = input.nextDouble();

        //! Operator choice
        System.out.println("(+) Addition");
        System.out.println("(-) Subtraction");
        System.out.println("(*) Multiplication");
        System.out.println("(/) Division");
        System.out.println("(^) Power");

        System.out.print("Enter your choice: ");
        input.nextLine();
        operator = input.nextLine();

        //! 2nd Number
        System.out.print("Enter 2nd number: ");
        num2 = input.nextDouble();

        switch (operator){
            case "+" -> System.out.printf("Addition of %.2f and %.2f is %.2f",num1,num2,(num1+num2));
            case "-" -> System.out.printf("Subtraction of %.2f and %.2f is %.2f",num1,num2,(num1-num2));
            case "*" -> System.out.printf("Product of %.2f and %.2f is %.2f",num1,num2,(num1*num2));
            case "/" -> {
                if (num2 == 0) {
                    System.out.println("Can not divided by 0");
                } else {
                    System.out.printf("Division of %.2f and %.2f is %.2f", num1, num2, (num1 / num2));
                }
            }
            case "^" -> System.out.printf("%.2f power %.2f is %.2f",num1,num2,Math.pow(num1,num2));
            default -> System.out.println("Invalid option!");
        }
    }
}