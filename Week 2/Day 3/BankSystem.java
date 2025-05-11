class BankAccount {
static String bankName = "XYZ Bank";
static int totalAccounts = 0;
final int accountNumber;
String accountHolderName;
public BankAccount(String accountHolderName) {
this.accountNumber = ++totalAccounts;
this.accountHolderName = accountHolderName;
}
public static int getTotalAccounts() {
return totalAccounts;
}
public void displayAccountDetails() {
if (this instanceof BankAccount) {
System.out.println("Bank Name: " + bankName);
System.out.println("Account Number: " + accountNumber);
System.out.println("Account Holder: " + accountHolderName);
}
}
}
public class BankSystem {
public static void main(String[] args) {
BankAccount account1 = new BankAccount("John Doe");
account1.displayAccountDetails();
System.out.println("Total Accounts: " +
BankAccount.getTotalAccounts());
}
}
