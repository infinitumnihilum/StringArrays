package davis.john;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jrdavis on 2/11/16.
 */
public class WordPalindromeTest {
WordPalindrome wordPalindrome;
    @Before
    public void setUp() throws Exception {
wordPalindrome = new WordPalindrome();
    }

    @Test
    public void testWordPalindrome() throws Exception {
        String notPalindrome = "I never saw a purple cow";
        String Palindrome = "rotavator";
        String expected = "False";
        String expected2 = "True";
        String actual = wordPalindrome.wordPalindrome(notPalindrome);
        String actual2 = wordPalindrome.wordPalindrome(Palindrome);
        assertEquals("Fails if not palindrome", expected, actual);
        System.out.println("Test Passed");
        assertEquals("Passes if palindrome", expected2,actual2);
        System.out.println("Test Passed");
    }
}