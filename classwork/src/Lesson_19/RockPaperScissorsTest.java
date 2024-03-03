package Lesson_19;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RockPaperScissorsTest {

    @Test
    void testDetermineWinner() {
        // Переможець
        assertEquals(1, RockPaperScissors.determineWinner(0, 2)); // Камінь vs Ножиці
        assertEquals(1, RockPaperScissors.determineWinner(1, 0)); // Папір vs Камінь
        assertEquals(1, RockPaperScissors.determineWinner(2, 1)); // Ножиці vs Папір

        // Програш
        assertEquals(-1, RockPaperScissors.determineWinner(2, 0)); // Ножиці vs Камінь
        assertEquals(-1, RockPaperScissors.determineWinner(0, 1)); // Камінь vs Папір
        assertEquals(-1, RockPaperScissors.determineWinner(1, 2)); // Папір vs Ножиці

        // Нічия
        assertEquals(0, RockPaperScissors.determineWinner(0, 0)); // Камінь vs Камінь
        assertEquals(0, RockPaperScissors.determineWinner(1, 1)); // Папір vs Папір
        assertEquals(0, RockPaperScissors.determineWinner(2, 2)); // Ножиці vs Ножиці
    }
}

