package C04Interface.Bank;

public interface BankServiceInterface {

    void deposit(long money, BankAccount ba);

    boolean withdraw(long money, BankAccount ba);
}