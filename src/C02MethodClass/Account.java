package C02MethodClass;

public class Account {
    private String name;
    private String accountnumber;
    private long balance;

    public Account(String name, String accountnumber, Long balance) {
        this.name = name;
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public long getBalance() {
        return balance;
    }

    public String  AccountInfo() {
        return this.name + this.accountnumber + this.balance;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", accountnumber='" + accountnumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
