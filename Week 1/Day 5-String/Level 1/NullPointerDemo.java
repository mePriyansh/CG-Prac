
public class NullPointerDemo {
    public static void generateException() {
        String text = null;
        int length = text.length(); 
    }
    public static void handleException() {
        String text = null;
        try {
            int length = text.length();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception in generateException: " + e.getMessage());
        }
        handleException();
    }
}

