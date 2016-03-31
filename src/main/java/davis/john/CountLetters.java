package davis.john;

/**
 * Created by jrdavis on 2/11/16.
 */
public class CountLetters {


    public String countNumLetters(String s){

        String count = "";

        int letterCount = 0;
        String[] letters = s.split("");

        for (int i = 0; i < letters.length; i ++){
            if (s.charAt(i)== 'e'){
                letterCount++;
            }

        }

        count +=  letterCount;

        return count;

    }
}
