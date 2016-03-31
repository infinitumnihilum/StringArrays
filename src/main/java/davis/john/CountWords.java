package davis.john;

/**
 * Created by jrdavis on 2/11/16.
 */
public class CountWords {




    public String printNumWords(String s){

        String count = "";
        String[] words = s.trim().split("\\s+");

        count += words.length;

        return count;

    }
}











/*if (s == null || s.isEmpty()){
        return 0;
        }

        int count = 0;
        for (int i = 0; i < s.length(); i++){
        if(s.charAt(i) != ' '){
        count++;
        }
        }
        return count;*/