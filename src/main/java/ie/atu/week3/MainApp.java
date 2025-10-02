package ie.atu.week3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Calculator calc = new Calculator();

        while (true) {
            System.out.println("Please Enter Your First Number: ");
            int firstNumber = scan.nextInt();

            System.out.println("Please Enter Your Second Number:");
            int secondNumber = scan.nextInt();

            System.out.println("Please Enter An Operation: ");
            String operation = scan.next();

            if(operation.equals("exit"))
            {
                System.out.println("Exiting Program");
                break;
            }


            switch (operation) {
                case "add":
                    int addResult = calc.add(firstNumber, secondNumber);
                    System.out.println("The Addition Result Is: " + addResult + "\n\n");
                    break;

                case "subtract":
                    int subResult = calc.sub(firstNumber, secondNumber);
                    System.out.println("The Subtraction Result Is: " + subResult + "\n\n");
                    break;

                case "multiply":
                    int mulResult = calc.mul(firstNumber, secondNumber);
                    System.out.println("The Multiplication Result Is: " + mulResult + "\n\n");
                    break;

                case "divide":
                    if (secondNumber == 0) {
                        System.out.println("Error: Divide By Zero Error!" + "\n\n");
                        break;
                    } else {
                        double divResult = (double) calc.div(firstNumber, secondNumber);
                        System.out.print("The Division Result Is: " + divResult + "\n\n");
                    }
                    break;

                case "power":
                    int powResult = calc.pow(firstNumber, secondNumber);
                    System.out.println("The Exponential Result Is: " + powResult + "\n\n");
                    break;

                case "modulus":
                    int modResult = calc.mod(firstNumber, secondNumber);
                    System.out.println("The Modulus Result Is: " + modResult + "\n\n");
                    break;

                default:
                    System.out.println("Error: Invalid Input  -  Please Try Again!" + "\n\n");
            }
        }
    }
}
