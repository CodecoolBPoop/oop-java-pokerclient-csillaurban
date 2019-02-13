import java.util.Arrays;
import java.util.HashMap;

public class Card {

    String cardCode;
    String suit;
    String value;
    static final String[] suits = new String[]{"S", "C", "D", "H"};
    static final String[] values = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    public Card(String cardCode) {
        this.cardCode = cardCode;
        this.suit = this.cardCode.substring(0, 1).toUpperCase();
        this.value = cardCode.substring(1).toUpperCase();

        if (!Arrays.asList(this.suits).contains(this.suit)) {
            throw new IllegalArgumentException("card color isn't valid: " + this.suit);
        }

        if(!Arrays.asList(this.values).contains(this.value)) {
            throw new IllegalArgumentException("card number isn't valid: " + Integer.parseInt(this.value));
        }
    }

    public int getValue() {
        int cardValueAsInt;

        if(this.value.equals("J")) {
            cardValueAsInt = 11;
        }else if(this.value.equals("Q")) {
            cardValueAsInt = 12;
        }else if(this.value.equals("K")) {
            cardValueAsInt = 13;
        }else if(this.value.equals("A")) {
            cardValueAsInt = 14;
        } else {
            cardValueAsInt = Integer.parseInt(this.value);
        }

        return cardValueAsInt;
    }

    public String getCardCode() {
        return cardCode;
    }
}
