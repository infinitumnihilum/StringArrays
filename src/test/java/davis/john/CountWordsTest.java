package davis.john;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jrdavis on 2/11/16.
 */
public class CountWordsTest {
CountWords countWords;


    @Before
    public void setUp() throws Exception {
countWords = new CountWords();
    }

    @Test
    public void testPrintNumWords() throws Exception {
        String s =  "I never saw a purple cow";
        String expected = "6";
        String actual = countWords.printNumWords(s);
        assertEquals("Fails if counted incorrectly ", expected, actual);
        System.out.println("Test Passed");

    }
}