
public class UsernameValidator {
    public static boolean validateUsername(String username) {
        return username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,14}$");
    }

    public static void main(String[] args) {
        System.out.println(validateUsername("user_123")); // true
        System.out.println(validateUsername("123user"));  // false
        System.out.println(validateUsername("us"));       // false
    }
}

