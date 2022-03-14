import java.util.Scanner;

public class Account {

    private int accountNo;
    private String accountName;
    private String accountSurmane;
    private long balance;
    Scanner scanner = new Scanner(System.in);

    public Account(int accountNo, String accountName, String accountSurmane, long balance) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.accountSurmane = accountSurmane;
        this.balance = balance;


    }

    public Account() {
    }



    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;

    }
    public void openAccount(){
        System.out.println("Podaj numer ID");
        accountNo = scanner.nextInt();
        System.out.println("Podaj imię");
        accountName = scanner.next();
        System.out.println(" Podaj nazwisko");
        accountSurmane = scanner.next();
        System.out.println(" Podaj stan konta");
        balance = scanner.nextInt();

    }


}
