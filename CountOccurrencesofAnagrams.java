package tandpwork;
import java.util.*;
/*
 * Given two strings s (text) and p (pattern), you need to find the number of substrings in s that are anagrams of p.

   An anagram means:

	Same characters
	Same frequency
	Order can be different
 */
public class CountOccurrencesofAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "forxxorfxdofr";
		String p = "for";
		HashMap<Character,Integer> hm=new HashMap<>();
		
		int count=0;
		 
		int t=s.length();
		int k=p.length();
		
		for(int i=0;i<t;i++) {
			
			
			
			if(hm.containsKey(s.charAt(i))) {
				int temp=hm.get(s.charAt(i));
				hm.put(s.charAt(i),temp+1);
			}else {
				hm.put(s.charAt(i),1);
			}
			
			for(var h:hm.keySet()) {
				if(h==p.charAt(i)) {
					count=1;
				}
			}
			
			
			if(k<=i) {
				
				hm.remove(s.charAt(i-k));
				
				if(hm.containsKey(s.charAt(i))) {
					int temp=hm.get(s.charAt(i));
					hm.put(s.charAt(i),temp+1);
				}else {
					hm.put(s.charAt(i),1);
				}
				
				
				
				
			}
			
		}
		
		

	}

}
