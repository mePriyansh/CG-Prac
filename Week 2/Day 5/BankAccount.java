class BankAccount {
String accountNumber;
double balance;
BankAccount(String accNum, double balance) {
this.accountNumber = accNum;
this.balance = balance;
}
}
class SavingsAccount extends BankAccount {
double interestRate;
SavingsAccount(String accNum, double balance, double interestRate) {
super(accNum, balance);
this.interestRate = interestRate;
}
void displayAccountType() {
System.out.println("Savings Account");
}
}
class CheckingAccount extends BankAccount {
double withdrawalLimit;
CheckingAccount(String accNum, double balance, double limit) {
super(accNum, balance);
this.withdrawalLimit = limit;
}
void displayAccountType() {
System.out.println("Checking Account");
}
}
class FixedDepositAccount extends BankAccount {
int term;
FixedDepositAccount(String accNum, double balance, int term) {
super(accNum, balance);
this.term = term;
}
void displayAccountType() {
System.out.println("Fixed Deposit Account");
}
}