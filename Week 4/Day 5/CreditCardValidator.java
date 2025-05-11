
public class CreditCardValidator {
    public static boolean validateVisa(String number) {
        return number.matches("^4\\d{15}$");
    }

    public static boolean validateMasterCard(String number) {
        return number.matches("^5\\d{15}$");
    }

    public static void main(String[] args) {
        System.out.println(validateVisa("4123456789012345"));
        System.out.println(validateMasterCard("5123456789012345"));
    }
}

