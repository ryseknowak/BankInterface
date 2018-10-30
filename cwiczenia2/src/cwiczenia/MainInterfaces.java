package cwiczenia;

import java.util.Scanner;
import java.util.Scanner.*;

public class MainInterfaces {
    public static void main(String[] args) {
        MainInterfaces main = new MainInterfaces();
        double arg1 = main.getArgument();
        double arg2 = main.getArgument();
        if (main.shouldMultiply() == true) {
            Multiplication multiplication = new Multiplication();
            System.out.println("Wynik mnonożenia " + arg1 + " * " + arg2 + " to " + multiplication.compute(arg1, arg2));
        } else {
            Addition addition = new Addition();
            System.out.println("Wynik dodawania " + arg1 + " + " + arg2 + " to " + addition.compute(arg1, arg2));
        }
    }

    private boolean shouldMultiply() {
        int answer;
        Scanner input = new Scanner(System.in);
        System.out.println("Czy pomnożyć liczby?\n 1-TAK");
        answer = input.nextInt();
        if (answer == 1) return true;
        else return false;
    }

    private double getArgument() {
        System.out.println("Podaj liczbę");
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
}

