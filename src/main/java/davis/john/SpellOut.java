package davis.john;

/**
 * Created by jrdavis on 2/11/16.
 */
public class SpellOut {

    public String printSpellOut(String s){
        String printdash = "";

        printdash += s.toUpperCase().replaceAll("", " ").trim().replaceAll(" ", "-").replaceAll("---", " ");


        return printdash;
    }
}
