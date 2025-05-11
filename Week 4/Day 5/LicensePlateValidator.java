
public class LicensePlateValidator {
    public static boolean validateLicensePlate(String plate) {
        return plate.matches("^[A-Z]{2}\\d{4}$");
    }

    public static void main(String[] args) {
        System.out.println(validateLicensePlate("AB1234"));
        System.out.println(validateLicensePlate("A12345"));
    }
}

