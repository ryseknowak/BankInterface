//import static java.lang.Math.*;

//import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Odczyt {
    public static void main(String[] args) {
        int tablica[] = {1, 2, 3, 4, 5};
        BufferedReader odczyt = new BufferedReader(new InputStreamReader(System.in));
        int index = -1;
        System.out.println("Podaj indeks tablicy");
        //index = odczyt.nextInt();
        boolean czyPoprawne = false;
        while (!czyPoprawne) {
            try {
                index = Integer.parseInt(odczyt.readLine());
                System.out.println("tablica[" + index + "]=" + tablica[index]);
            } catch (NumberFormatException n) {
                System.out.println("Niepoprawne dane!" + "\nPodaj nowy indeks");
            } catch (IOException e) {
                System.out.println("Błąd odczytu danych");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Podany indeks wykracza poza rozmiar tablicy = " + tablica.length);
            }
            czyPoprawne = index == -1 ? false : true;
        }
    }
}


