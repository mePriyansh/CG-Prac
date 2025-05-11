
public class HexColorValidator {
    public static boolean validateHexColor(String color) {
        return color.matches("^#([A-Fa-f0-9]{6})$");
    }

    public static void main(String[] args) {
        System.out.println(validateHexColor("#FFA500"));
        System.out.println(validateHexColor("#ff4500"));
        System.out.println(validateHexColor("#123"));
    }
}

