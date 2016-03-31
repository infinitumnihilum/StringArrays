package davis.john;

/**
 * Created by jrdavis on 2/11/16.
 */
public class ReverseString {

    public String reverseTheString (String s){
        String reverse = "";
        String[] wordArray = s.split("");
        String[] reversed = new String[wordArray.length];

        for (int i = 0; i < wordArray.length; i++){
            reversed[i]= wordArray[wordArray.length -1 -i];
            reverse = reverse + String.join(" ",reversed[i]);
        }

        return reverse;
    }
}
