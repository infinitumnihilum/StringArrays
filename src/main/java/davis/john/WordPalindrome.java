package davis.john;

/**
 * Created by jrdavis on 2/11/16.
 */
public class WordPalindrome {

    public String wordPalindrome(String s){


        String[] wordArray = s.split("");
        String[] reversed = new String[wordArray.length];

        for (int i = 0; i < wordArray.length / 2; i++){
            reversed[i]= wordArray[wordArray.length -1 -i];
            for (int j =0; j <reversed.length / 2; j++){

                if (wordArray[i].equals(reversed[i])){
                    return "True";
                }else{
                    return "False";
                }
            }

        }



        return wordPalindrome(s);

    }
}
