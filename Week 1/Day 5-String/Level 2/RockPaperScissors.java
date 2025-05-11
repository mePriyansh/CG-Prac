
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    public static String getComputerChoice() {
        Random random = new Random();
        int choice = random.nextInt(3); // 0 = rock, 1 = paper, 2 = scissors
        switch (choice) {
            case 0:
                return "Rock";
            case 1:
                return "Paper";
            case 2:
                return "Scissors";
            default:
                return "";
        }
    }
    public static String getWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        } else if ((userChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
                   (userChoice.equals("Paper") && computerChoice.equals("Rock")) ||
                   (userChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
            return "Player";
        } else {
            return "Computer";
        }
    }
    public static String[][] calculateStats(int playerWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][2];
        stats[0][0] = "Player Wins";
        stats[0][1] = String.valueOf(playerWins);
        stats[1][0] = "Computer Wins";
        stats[1][1] = String.valueOf(computerWins);
        double playerWinPercentage = (totalGames > 0) ? ((double) playerWins / totalGames) * 100 : 0;
        double computerWinPercentage = (totalGames > 0) ? ((double) computerWins / totalGames) * 100 : 0;
        stats[0][1] += " (" + String.format("%.2f", playerWinPercentage) + "%)";
        stats[1][1] += " (" + String.format("%.2f", computerWinPercentage) + "%)";
        return stats;
    }
    public static void displayResults(String[][] stats) {
        System.out.println("Stats:");
        System.out.println("--------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + ": " + stats[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerWins = 0;
        int computerWins = 0;
        int totalGames;
        System.out.print("Enter the number of games you want to play: ");
        totalGames = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        for (int i = 1; i <= totalGames; i++) {
            System.out.print("Game " + i + ": Enter your choice (Rock, Paper, Scissors): ");
            String userChoice = scanner.nextLine();
            String computerChoice = getComputerChoice();
            System.out.println("Computer choice: " + computerChoice);
            String winner = getWinner(userChoice, computerChoice);
            if (winner.equals("Player")) {
                playerWins++;
                System.out.println("You win this game!");
            } else if (winner.equals("Computer")) {
                computerWins++;
                System.out.println("Computer wins this game!");
            } else {
                System.out.println("It's a draw!");
            }
            System.out.println();
        }
        String[][] stats = calculateStats(playerWins, computerWins, totalGames);
        displayResults(stats);
   scanner.close();
    }
}

