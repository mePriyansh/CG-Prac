
public class SpaceReplacer {
    public static void main(String[] args) {
        String input = "This    is   an   example  with    multiple    spaces.";
        System.out.println(input.replaceAll("\\s{2,}", " "));
    }
}

