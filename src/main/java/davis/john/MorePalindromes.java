package davis.john;

/**
 * Created by jrdavis on 2/11/16.
 */
public class MorePalindromes {

    public String morePalindromes(String s){

        String lettersonly = s.replaceAll("[\\W]", "");

        String[] wordArray = lettersonly.split("");
        String[] reversed = new String[wordArray.length];


        for (int i = 0; i < wordArray.length / 2; i++){
            reversed[i]= wordArray[wordArray.length -1 -i];
            for (int j =0; j <reversed.length / 2; j++){

                if (wordArray[i].equalsIgnoreCase(reversed[i])){
                    return "True";
                }else{
                    return "False";
                }
            }

        }

        return morePalindromes(s);
    }

}
