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
        int powResult = calc.pow(firstNumber, secondNumber);
        int modResult = calc.mod(firstNumber, secondNumber);

        System.out.println("The Addition Result Is: " + addResult);
        System.out.println("The Subtraction Result Is: " + subResult);
        System.out.println("The Multiplication Result Is: " + mulResult);

        if(secondNumber == 0){
            System.out.println("Error: Divide By Zero Error!");
        }
        else
        {
            int divResult = calc.div(firstNumber, secondNumber);
            System.out.println("The Division Result Is: " + divResult);
        }

        System.out.println("The Exponential Result Is: " + powResult);
        System.out.println("The Modulus Result Is: " + modResult);
    }
}
