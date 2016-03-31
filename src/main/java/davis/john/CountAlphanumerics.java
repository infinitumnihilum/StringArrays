package davis.john;

/**
 * Created by jrdavis on 2/11/16.
 */
public class CountAlphanumerics {

    public String countAlphaNums(String s){
        String count = "";

        int alphacount = 0;
        String[] letters = s.split("");

        for (int i = 0; i < letters.length; i ++){
            if (s.charAt(i) != ' ' ){
                alphacount++;
            }
            if (s.charAt(i)== '.'){
                alphacount--;
            }
            if (s.charAt(i)== ','){
                alphacount--;
            }

        }

        count +=  alphacount;

        return count;
    }


}
