package EnumsExercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner stream = new Scanner(System.in);
        String calculation = "";
        double y = 0;
        double x = 0;
        boolean isCorrect = false;
        System.out.println("Type calculation:");
        do {
            try {
                System.out.print("Give first number:    ");
                x = stream.nextDouble();
                System.out.print("Type sign of computation(+,-,*,/):   ");
                stream.nextLine();
                calculation = stream.nextLine();
                if (!calculation.equals("+") && !calculation.equals("-") && !calculation.equals("*") && !calculation.equals("/")) {
                    stream.nextLine();
                    throw new SignMismatchExeption();
                }
                System.out.print("Give secound number:   ");
                y = stream.nextDouble();
                stream.nextLine();
                isCorrect = true;
            } catch (InputMismatchException ime) {
                stream.nextLine();
                System.out.println("This is not a number! Try again.");
            } catch (SignMismatchExeption sme) {
                System.out.println("Given sign is not computation! Try again.");
            }
        } while (!isCorrect);
        switch (calculation) {
            case "+":
                System.out.println("The result is:  " + Computations.ADD.perform(x, y));
                break;
            case "-":
                System.out.println("The result is:  " + Computations.SUBSTRACT.perform(x, y));
                break;
            case "*":
                System.out.println("The result is:  " + Computations.MULTIPLY.perform(x, y));
                break;
            case "/":
                System.out.println("The result is:  " + Computations.DEVIDE.perform(x, y));
                break;
        }
    }
}
