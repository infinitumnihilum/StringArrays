package davis.john;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jrdavis on 2/11/16.
 */
public class CountLettersTest {
    CountLetters countLetters;
    @Before
    public void setUp() throws Exception {
    countLetters = new CountLetters();
    }

    @Test
    public void testCountNumLetters() throws Exception {
        String countLetterE = "I never saw a purple cow every";
        String expected = "5";
        String actual = countLetters.countNumLetters(countLetterE);
        assertEquals("Fails if it counts incorrectly", expected, actual);
        System.out.println("Test Passed");

    }
}