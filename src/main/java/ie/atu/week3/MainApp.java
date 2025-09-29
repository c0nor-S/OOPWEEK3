package ie.atu.week3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter Your First Number: ");
        int firstNumber = scan.nextInt();

        System.out.println("Please Enter Your Second Number:");
        int secondNumber = scan.nextInt();

        System.out.println("Please Enter An Operation: ");
        String operation = scan.next();

        Calculator calc = new Calculator();


        switch (operation) {
            case "add":
                int addResult = calc.add(firstNumber, secondNumber);
                System.out.println("The Addition Result Is: " + addResult);
            break;

            case "subtract":
                int subResult = calc.sub(firstNumber, secondNumber);
                System.out.println("The Subtraction Result Is: " + subResult);
            break;

            case "multiply":
                int mulResult = calc.mul(firstNumber, secondNumber);
                System.out.println("The Multiplication Result Is: " + mulResult);
            break;

            case "divide":
            if (secondNumber == 0) {
                System.out.println("Error: Divide By Zero Error!");
                break;
            } else {
                int divResult = calc.div(firstNumber, secondNumber);
                System.out.println("The Division Result Is: " + divResult);
            }
            break;

            case "power":
                int powResult = calc.pow(firstNumber, secondNumber);
                System.out.println("The Exponential Result Is: " + powResult);
            break;

            case "modulus":
                int modResult = calc.mod(firstNumber, secondNumber);
                System.out.println("The Modulus Result Is: " + modResult);
            break;

            default:
        }
    }
}
