package Lesson_19;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String[] CHOICES = {"Камінь", "Папір", "Ножиці"};
    private static final int ROCK = 0;
    private static final int PAPER = 1;
    private static final int SCISSORS = 2;
    private static final int WIN = 1;
    private static final int LOSE = -1;
    private static final int DRAW = 0;
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Доброго дня та Вітаємо у грі 'Камінь, Ножиці, Папір'!");

        System.out.print("Введіть ім'я: ");
        String playerName = scanner.nextLine();

        System.out.print("Введіть кількість ігор: ");
        int numOfGames = scanner.nextInt();
        scanner.nextLine(); // Очищення буфера

        int gamesPlayed = 0;
        int gamesWon = 0;
        int gamesLost = 0;

        while (gamesPlayed < numOfGames) {
            System.out.print("\nЗробить вибір де (0 це Камінь, 1 це Папір, 2 це Ножиці): ");
            int playerChoice = scanner.nextInt();

            if (playerChoice < 0 || playerChoice > 2) {
                System.out.println("Неправильний вибір. Будь ласка, зробіть спробу знову.");
                continue;
            }

            int computerChoice = random.nextInt(3);
            System.out.println("Комп'ютер обрав: " + CHOICES[computerChoice]);

            int result = determineWinner(playerChoice, computerChoice);

            if (result == WIN) {
                System.out.println("Ви виграли!");
                gamesWon++;
            } else if (result == LOSE) {
                System.out.println("Ви програли.");
                gamesLost++;
            } else {
                System.out.println("Нічия.");
            }

            gamesPlayed++;
        }

        System.out.println("\nРезультати для " + playerName + ":");
        System.out.println("Зіграно кількість ігор: " + numOfGames);
        System.out.println("Було виграно: " + gamesWon);
        System.out.println("Було програно: " + gamesLost);

        scanner.close();
    }

    static int determineWinner(int playerChoice, int computerChoice) {
        if ((playerChoice == ROCK && computerChoice == SCISSORS) ||
                (playerChoice == PAPER && computerChoice == ROCK) ||
                (playerChoice == SCISSORS && computerChoice == PAPER)) {
            return WIN;
        } else if ((computerChoice == ROCK && playerChoice == SCISSORS) ||
                (computerChoice == PAPER && playerChoice == ROCK) ||
                (computerChoice == SCISSORS && playerChoice == PAPER)) {
            return LOSE;
        } else {
            return DRAW;
        }
    }
}

