package davis.john;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jrdavis on 2/11/16.
 */
public class SpellOutTest {
SpellOut spellOut;
    @Before
    public void setUp() throws Exception {
spellOut = new SpellOut();
    }

    @Test
    public void testPrintSpellOut() throws Exception {
    String spell = "Spell it out";
    String expected = "S-P-E-L-L I-T O-U-T";
    String actual = spellOut.printSpellOut(spell);
    assertEquals("Fails if no dashes are between letters only", expected, actual);
        System.out.println("Test Passed");


    }
}