
public class IPAddressValidator {
    public static boolean isValidIP(String ip) {
        return ip.matches("((25[0-5]|2[0-4]\\d|1?\\d{1,2})\\.){3}(25[0-5]|2[0-4]\\d|1?\\d{1,2})");
    }

    public static void main(String[] args) {
        System.out.println(isValidIP("192.168.1.1"));
        System.out.println(isValidIP("999.999.999.999"));
    }
}

