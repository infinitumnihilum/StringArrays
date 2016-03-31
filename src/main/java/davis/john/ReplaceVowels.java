package davis.john;

/**
 * Created by jrdavis on 2/11/16.
 */
public class ReplaceVowels {


    public String printReplaceVowels(String s){
        String replace = "";


        replace += s.toLowerCase().replaceAll("[a,e,i,o.u]", "*");

        return replace;
    }
}
