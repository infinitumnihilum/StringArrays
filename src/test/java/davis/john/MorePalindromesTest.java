package davis.john;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jrdavis on 2/11/16.
 */
public class MorePalindromesTest {
MorePalindromes morePalindromes;
    @Before
    public void setUp() throws Exception {
morePalindromes = new MorePalindromes();
    }

    @Test
    public void testMorePalindromes() throws Exception {
        String notPalindrome = "I never saw a purple cow";
        String Palindrome = "Rise to vote, Sir!";
        String expected = "False";
        String expected2 = "True";
        String actual = morePalindromes.morePalindromes(notPalindrome);
        String actual2 = morePalindromes.morePalindromes(Palindrome);
        assertEquals("Fails if not palindrome", expected, actual);
        System.out.println("Test Passed");
        assertEquals("Passes if palindrome", expected2,actual2);
        System.out.println("Test Passed");


    }
}