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
        int result = calc.add(firstNumber, secondNumber);
        System.out.println("The Result Is: " + result);
    }
}
