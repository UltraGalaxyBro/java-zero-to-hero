package bankAccount;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setNumber("7845-1414");
        account.setHolder("Cláudio José de Faria");
        
        account.deposit(1000);
        account.draw(73.50); 
    }
}
