package bankAccount;

public class BankAccount {
    private String number;
    private String holder;
    private double balance;

    // Constructor
    public BankAccount() {
        this.balance = 0;
    }

    // Getters e Setters

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    void deposit(double value) {
        if (value <= 0) {
            System.out.println("Por favor, insira um valor acima de 0 para realizar o depósito.");
        } else {
            balance += value;
            System.out.println("Depósito de R$ " + value + " feito com sucesso! Saldo atual de R$ " + balance);
        }
    }

    void draw(double value) {
        if (value <= 0) {
            System.out.println("Por favor, insira um valor acima de 0 para realizar o saque.");
        } else if (balance < value) {
            System.out.println("Saldo insuficiente para este saque.");
        } else {
            balance -= value;
            System.out.println("Saque de R$ " + value + " efetuado com sucesso! Saldo atual de R$ " + balance);
        }
    }
}
