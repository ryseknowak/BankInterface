package BankInterface;

public class YesOrNoException extends Exception {
    public YesOrNoException(){
        System.out.format("Type Y if YES or type N if NO\n");
    }
}
