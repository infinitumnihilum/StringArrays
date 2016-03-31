package davis.john;

/**
 * Created by jrdavis on 2/11/16.
 */
public class DecoderCipher {
    public String cipherDecoder(String s){
        String decode = "";
        String [] stringOfNums = s.split("\\s+");

                  for (String word : stringOfNums)
                      {String [] codes = word.split(",");
                       for (String code: codes)
                             {
                                 int addint = Integer.parseInt(code.trim());
                                 decode = decode + (char)(addint+96);
                              }
                          decode = decode + " ";
                      }

    return decode.substring(0,decode.length()-1)  ;
    }
}
