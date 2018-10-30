package cwiczenia;

import static java.lang.Math.*;

import java.lang.reflect.Array.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class KlasaTestowa {
    public static void main(String[] args) {
/*        //STRING[] ARRAYS
        String[] array1 = new String[5];
        Arrays alphabet = new Arrays();
        alphabet.getLetters(array1);
        for (String el : array1) System.out.print(el);*/

/*        //REVERSE
        int[] array2 = new int[11];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i;
        }
        Arrays num = new Arrays();
        num.reverse(array2);
        for (int x : array2) System.out.print(x);*/

/*        //CREATING
        Arrays creating = new Arrays();
        int[] array3 = creating.createIntArray(5);
        int[][] array4 = creating.createIntArray(5, 5);
        for (int i = 0; i < array3.length; i++) array3[i] = i;
        System.out.println("tablica jednowymiarowa");
        for (int x : array3) {
            System.out.println(x);
        }
        int a = 0;
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                array4[i][j] = a;
                a++;
            }
        }
        System.out.println("tablica dwuwymiarowa");
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                System.out.print(array4[i][j]);
            }
            System.out.print("\n");
        }*/

/*        //INT TO STRING
        Arrays obj = new Arrays();
        String number = obj.change(125);
        System.out.println(number);*/

/*        //IDENTITY MATRIX
        Arrays array = new Arrays();
        String word = new String();
        word = "klapek";
        int[] sequence = array.createIntArray(5);
        int[][] ide_matrix = array.identityMatrix(5);
        array.view(word.toCharArray());
        array.view(sequence);
        array.view(ide_matrix);*/

        /*//I/O READING
        Arrays obj = new Arrays();
        Scanner input = new Scanner(System.in);
        int[] array = new int[0];
        boolean isCorrect = false;
        do {
            try {
                System.out.println("How many numbers in a sequence you want? :");
                int size = input.nextInt();
                array = obj.createIntArray(size);
                isCorrect = true;
            } catch (NegativeArraySizeException nase) {
                //nase.printStackTrace();
                System.out.println("The size of an array has to be positive!\nENTER DATA AGAIN");
            } catch (InputMismatchException ime) {
                //ime.printStackTrace();
                System.out.println("The type of given data is incorrect! (Should be integer)\nENTER DATA AGAIN");
                input.nextLine();
            }
        } while (!isCorrect);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Give " + (i + 1) + "' number of sequence");
            isCorrect = false;
            do {
                try {
                    array[i] = input.nextInt();
                    if (array[i] > 9 || array[i] < 0) {
                        throw new NumberIsNotDigitExeption();
                    }
                    isCorrect = true;
                } catch (NumberIsNotDigitExeption ninde) {
                    //ninde.printStackTrace();
                    System.out.println("The number is not digit\nENTER DATA AGAIN");
                    input.nextLine();
                } catch (InputMismatchException ime) {
                    //ime.printStackTrace();
                    System.out.println("The type of given data is incorrect! (Should be a number)\nENTER DATA AGAIN");
                    input.nextLine();
                }
            } while (!isCorrect);
        }
        System.out.println("sekwencja to:");
        obj.view(array);
        System.out.println();
        obj.bubbleSort(array);
        obj.view(array);*/
    }
}
