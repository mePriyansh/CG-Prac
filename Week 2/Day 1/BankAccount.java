public class BankAccount {
private String accountHolder;
private String accountNumber;
private double balance;
public BankAccount(String accountHolder, String accountNumber, double
balance) {
this.accountHolder = accountHolder;
this.accountNumber = accountNumber;
this.balance = balance;
}
public void deposit(double amount) {
if (amount > 0) {
balance += amount;
System.out.println("Deposited: $" + amount);
} else {
System.out.println("Deposit amount must be positive.");
}
}
public void withdraw(double amount) {
if (amount > 0 && amount <= balance) {
balance -= amount;
System.out.println("Withdrew: $" + amount);
} else if (amount > balance) {
System.out.println("Insufficient balance.");
} else {
System.out.println("Withdrawal amount must be positive.");
}
}
public void displayBalance() {
System.out.println("Current Balance: $" + balance);
}
public static void main(String[] args) {
BankAccount account1 = new BankAccount("Alice", "123456", 500.0);
account1.displayBalance();
account1.deposit(200.0);
account1.displayBalance();
account1.withdraw(100.0);
account1.displayBalance();
account1.withdraw(700.0);
}
}