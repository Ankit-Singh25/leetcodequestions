package tandpwork;
import java.util.*;
public class RemoveDuplicateLetters {
	/*
	 
	 Given a string s, remove duplicate letters so that every letter appears once and only once. 
	 You must make sure your result is the smallest in lexicographical order among all possible results.
	 a<b<c<d<e.....<y<z;  give preference  to smallest
	 Input: s = "cbacdcbc"
	 Output: "acdb"
	 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbacdcbc";

        Stack<Character> st = new Stack<>();
        HashSet<Character> hs = new HashSet<>();

        int lastIndex[] = new int[26];

        // store last occurrence
        for(int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(hs.contains(ch))
                continue;

            while(!st.isEmpty() &&
                  st.peek() > ch &&
                  lastIndex[st.peek() - 'a'] > i) {

                char removed = st.pop();
                hs.remove(removed);
            }

            st.push(ch);
            hs.add(ch);
        }

        StringBuilder result = new StringBuilder();

        for(char c : st)
            result.append(c);

        System.out.println(result.toString());
		
		
	}

}
