public class Account {

    private int accountNo;
    private String accountName;
    private String accountSurmane;
    private long balance;

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


}
