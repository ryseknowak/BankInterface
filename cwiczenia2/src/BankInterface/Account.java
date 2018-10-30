package BankInterface;

import java.util.Objects;
import java.util.Random;
import java.util.Arrays;

public class Account {
    private Long accountNr;    //16 numbers
    private double balance;


    public Account() {
        this.generateAccountNr(16);
        this.balance = 0;
    }

    public Long getAccountNr() {
        return accountNr;
    }

    public double getBalance() {
        return balance;
    }

    public void increaseBalance(double amount) throws NotPositiveNumberExeption {
        if (amount < 0) {
            throw new NotPositiveNumberExeption();
        }
        this.balance = balance + amount;
    }

    public void decreaseBalance(double amount) throws NotPositiveNumberExeption {
        if (amount < 0) {
            throw new NotPositiveNumberExeption();
        }
        this.balance = balance - amount;
    }

    private void generateAccountNr(int characters) {
        Random generator = new Random();
        long accountNumber = 0L;
        //int[] accountArray = new int[characters];
        for (int i = 0; i < characters; i++) {
            //accountArray[i] = generator.nextInt(characters);
            accountNumber = accountNumber + (long)(Math.pow(10, i)*generator.nextInt(9));
        }
        this.accountNr = accountNumber;
        //String accountString = Arrays.toString(accountArray);
        //this.accountNr = Long.parseLong(accountString);
    }

}
