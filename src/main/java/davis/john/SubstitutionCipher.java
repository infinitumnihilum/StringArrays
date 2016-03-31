package davis.john;

/**
 * Created by jrdavis on 2/11/16.
 */
public class SubstitutionCipher {


    public String printCipher(String s){
        String ciphercodes = "";
        String structureS = s.toUpperCase().replaceAll("", " ").trim();


        char[] charArray = structureS.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];

            int pos = ch - 'a' +33 ;

            ciphercodes += pos;
        }
        return ciphercodes.replaceAll("-32",",").replaceAll(",,,", " ");
    }


}
