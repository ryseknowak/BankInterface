package Exceptions;

public class WrongPasswordFormatException extends Exception {
    public WrongPasswordFormatException(){
        System.out.println("Password is not meeting the requirements.");
    }
}
