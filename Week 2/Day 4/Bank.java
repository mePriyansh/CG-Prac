class Bank {
String name;
Bank(String name) {
this.name = name;
}
void openAccount(Customer customer) {
customer.bank = this;
}
}
class Customer {
String name;
double balance;
Bank bank;
Customer(String name, double balance) {
this.name = name;
this.balance = balance;
}
void viewBalance() {
System.out.println("Balance: " + balance);
}
}
