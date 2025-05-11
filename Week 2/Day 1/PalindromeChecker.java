public class PalindromeChecker {
private String text;
public PalindromeChecker(String text) {
this.text = text;
}
public boolean isPalindrome() {
String reversedText = new StringBuilder(text).reverse().toString();
return text.equals(reversedText);
}
public void displayResult() {
if (isPalindrome()) {
System.out.println("The text is a palindrome.");
} else {
System.out.println("The text is not a palindrome.");
}
}
public static void main(String[] args) {
PalindromeChecker checker1 = new PalindromeChecker("madam");
checker1.displayResult();
PalindromeChecker checker2 = new PalindromeChecker("hello");
checker2.displayResult();
}
}