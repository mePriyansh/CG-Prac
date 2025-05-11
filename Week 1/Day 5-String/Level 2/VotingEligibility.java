
import java.util.Scanner;
public class VotingEligibility {
    public static int[] getStudentAges(int numStudents) {
        int[] ages = new int[numStudents];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter age for student " + (i + 1) + ":");
            ages[i] = scanner.nextInt();
        }scanner.close();
        return ages;
    }
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                result[i][0] = "Invalid Age";
                result[i][1] = "Cannot Vote";
            } else {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
            }
        }
        return result;
    }
    public static void displayVotingEligibility(String[][] result) {
        System.out.println("Age\tEligibility");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }
    }
    public static void main(String[] args) {
        int numStudents = 10;
        int[] studentAges = getStudentAges(numStudents);
        String[][] votingEligibility = checkVotingEligibility(studentAges);
        displayVotingEligibility(votingEligibility);
    }
}

