import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    @Test
    @DisplayName("Testing constructor")
    void testingConstructor() {
        String cardCode = "s8";
        Card card = new Card(cardCode);
        assertEquals(cardCode, card.getCardCode());
    }

    @Test
    @DisplayName("Testing constructor for illegal card color")
    void testingConstructorIllegalColor() {
        String card = "l3";
        assertThrows(IllegalArgumentException.class, () -> new Card(card));
    }

    @Test
    @DisplayName("Testing constructor for illegal card value")
    void testingConstructorIllegalValue() {
        String cardOne = "s11";
        String cardTwo = "s1";
        assertThrows(IllegalArgumentException.class, () -> new Card(cardOne));
        assertThrows(IllegalArgumentException.class, () -> new Card(cardTwo));
    }

    @Test
    @DisplayName("Testing getValue() method")
    void getValue() {
        Card cardWithNumber = new Card("d3");
        Card cardWithLetter = new Card("dk");
        assertEquals(3, cardWithNumber.getValue());
        assertEquals(13, cardWithLetter.getValue());
    }
}