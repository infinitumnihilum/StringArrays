package davis.john;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jrdavis on 2/11/16.
 */
public class ReverseStringTest {
ReverseString reverseString;
    @Before
    public void setUp() throws Exception {
reverseString = new ReverseString();
    }

    @Test
    public void testReverseTheString() throws Exception {
        String reverse = "I never saw a purple cow";
        String expected = "woc elprup a was reven I";
        String actual = reverseString.reverseTheString(reverse);
        assertEquals("Fails if string not reversed", expected, actual);
        System.out.println("Test Passed");


    }
}