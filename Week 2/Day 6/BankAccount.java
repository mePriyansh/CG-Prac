abstract class BankAccount {
private String accountNumber;
private String holderName;
private double balance;
public BankAccount(String accountNumber, String holderName, double
balance) {
this.accountNumber = accountNumber;
this.holderName = holderName;
this.balance = balance;
}
public void deposit(double amount) {
balance += amount;
}
public void withdraw(double amount) {
if(balance >= amount) balance -= amount;
}
public abstract double calculateInterest();
public String getAccountNumber() { return accountNumber; }
public void setAccountNumber(String accountNumber) { this.accountNumber
= accountNumber; }
public String getHolderName() { return holderName; }
public void setHolderName(String holderName) { this.holderName =
holderName; }
public double getBalance() { return balance; }
public void setBalance(double balance) { this.balance = balance; }
}
interface Loanable {
void applyForLoan(double amount);
double calculateLoanEligibility();
}
class SavingsAccount extends BankAccount implements Loanable {
public SavingsAccount(String number, String name, double balance) {
super(number, name, balance);
}
public double calculateInterest() {
return getBalance() * 0.04;
}
public void applyForLoan(double amount) {}
public double calculateLoanEligibility() {
return getBalance() * 2;
}
}
class CurrentAccount extends BankAccount implements Loanable {
public CurrentAccount(String number, String name, double balance) {
super(number, name, balance);
}
public double calculateInterest() {
return 0;
}
public void applyForLoan(double amount) {}
public double calculateLoanEligibility() {
return getBalance() * 1.5;
}
}
