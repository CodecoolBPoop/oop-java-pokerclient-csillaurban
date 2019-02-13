import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokerClientTest {

    @Test
    @DisplayName("Testing who's got the highest card")
    void testHighestCardIsMine() {
        PokerClient pokerClient = new PokerClient("sk", "c5", "dj", "h8", "c10");
        assertTrue(pokerClient.highestCardIsMine("s2", "s2", "s2", "s2", "s2"));
        assertFalse(pokerClient.highestCardIsMine("s2", "sA", "s2", "s2", "s2"));
    }

    @Test
    @DisplayName("Testing if equal value of cards")
    void testCardsWithEqualValues() {
        PokerClient pokerClient = new PokerClient("sa", "c5", "dj", "h8", "c10");
        assertTrue(pokerClient.highestCardIsMine("sa", "s2", "s2", "s2", "s2"));
    }
}