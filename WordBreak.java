package tandpwork;
import java.util.*;

public class WordBreak {

    public static void main(String[] args) {

        String s="applepenapple";
        ArrayList<String> wordDict=new ArrayList<>();
        wordDict.add("apple");
        wordDict.add("pen");
        boolean result=false;

        int i=0;
        int j=0;

        while(i < s.length()) {   // ❌ removed j condition (not needed)

            boolean found = false;   // ✅ added

            for(int p=0; p<wordDict.size(); p++) {

                j = i + wordDict.get(p).length();   // ✅ fixed

                if(j <= s.length() && s.substring(i,j).equals(wordDict.get(p))) {
                    result = true;
                    i = j;          // ✅ correct move
                    found = true;   // ✅ mark found
                    break;          // ✅ stop checking more words
                }
            }

            if(!found) {   // ✅ if no word matched
                result = false;
                break;
            }
        }

        System.out.println(result);
    }
}