package BankInterface;

import java.util.*;
import java.lang.Math;

public class User {
    private Long userId;            //8 numbers
    private String password;            //6-12 characters
    private String name;
    private String surname;
    private Map<Long, Account> accounts;


    public User() {
        Scanner scanner = new Scanner(System.in);
        this.generateId(8);
        boolean isCorrect = false;
        System.out.format("Your user id is: %d%n\nPlease remember it.\n", this.getUserId());
        do {
            try {
                System.out.println("Type your password. It should has 6-12 characters");
                String password = scanner.nextLine();
                setPassword(password);
                isCorrect = true;
            } catch (WrongPasswordFormatException wpfe) {
                System.out.println("Please try again.");
            }
        } while (!isCorrect);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        setName(name);
        System.out.println("What is your surname?");
        String surname = scanner.nextLine();
        setSurname(surname);
        accounts = new TreeMap<>();
        this.openAccount();
        scanner.close();
    }

    public Long getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws WrongPasswordFormatException {
        if (password.length() < 6 || password.length() > 12) {
            throw new WrongPasswordFormatException();
        }
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void openAccount() {
        Account new_account = new Account();
        int size = this.accounts.size();
        this.accounts.put(new_account.getAccountNr(), new_account);
        if (this.accounts.size() == size + 1) {
            System.out.format("We have opened new account for you.\n New account number is: %d%n", new_account.getAccountNr());
        } else System.out.format("Opening new account has failed.");
    }

    public void closeAccount() {
        if (!this.accounts.isEmpty()) {
            Scanner scanner = new Scanner(System.in);
            if (this.accounts.size() > 1) {
                System.out.format("Which account you would like to close?");
                this.accounts.forEach((k, v) -> System.out.format("Account number: %d%n\n", k));
                System.out.format("Type account number to be closed: ");
                String accountNumber = scanner.nextLine();
                this.accounts.forEach((k, v) -> {
                    if (k.equals(Long.parseLong(accountNumber))) {
                        if (this.accounts.remove(k, v)) {
                            System.out.format("Account with number: %d%n has been closed", k);
                        } else System.out.format("Closing the account did not succeed");
                    }
                });


            } else {
                System.out.format("Would you like to close your only account?\nY/N: ");
                boolean isCorrect = false;
                do {
                    try {
                        String input = scanner.nextLine();
                        if (input.length() != 1 || !input.equals("Y") || !input.equals("N"))
                            throw new YesOrNoException();
                        else isCorrect = true;
                    } catch (YesOrNoException yon) {
                        System.out.format("Please type again\n");
                    }/*catch (NoSuchElementException nsee){
                        nsee.printStackTrace();
                    }*/
                } while (!isCorrect);
                this.accounts.clear();
            }
        }
    }


    private void generateId(int characters) {
        Random generator = new Random();
        long userId = 0L;
        //int[] idArray = new int[characters];
        for (int i = 0; i < characters; i++) {
            //idArray[i] = generator.nextInt(9);
            userId = userId + (int) Math.pow(10, i) * generator.nextInt(9);

        }
        this.userId = userId;
        //String accountString = Arrays.toString(idArray);
        //this.userId = Long.parseLong(accountString);
    }
}
