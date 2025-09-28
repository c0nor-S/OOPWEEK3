package ie.atu.week3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter Your First Number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Please Enter Your Second Number:");
        int secondNumber = scan.nextInt();

        Calculator calc = new Calculator();
        int addResult = calc.add(firstNumber, secondNumber);
        int subResult = calc.sub(firstNumber, secondNumber);
        int mulResult = calc.mul(firstNumber, secondNumber);

        System.out.println("The Addition Result Is: " + addResult);
        System.out.println("The Subtraction Result Is: " + subResult);
        System.out.println("The Multiplication Result Is: " + mulResult);
    }
}
