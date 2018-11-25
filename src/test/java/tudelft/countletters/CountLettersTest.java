package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void oneWord() {
        int words = new CountLetters().count("dogr");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void noMatch() {
        int words = new CountLetters().count("dog|cat");
        Assertions.assertEquals(0, words);
    }

    @Test
    public void threeWords() {
        int words = new CountLetters().count("cats|dogr|lamps");
        Assertions.assertEquals(3, words);
    }
}