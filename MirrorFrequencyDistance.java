package tandpwork;
import java.util.*;

/*
 * You are given a string s consisting of lowercase English letters and digits.

For each character, its mirror character is defined by reversing the order of its character set:

For letters, the mirror of a character is the letter at the same position from the end of the alphabet.
For example, the mirror of 'a' is 'z', and the mirror of 'b' is 'y', and so on.
For digits, the mirror of a character is the digit at the same position from the end of the range '0' to '9'.
For example, the mirror of '0' is '9', and the mirror of '1' is '8', and so on.
For each unique character c in the string:

Let m be its mirror character.
Let freq(x) denote the number of times character x appears in the string.
Compute the absolute difference between their frequencies, defined as: |freq(c) - freq(m)|


Input: s = "ab1z9"

Output: 3
 */
public class MirrorFrequencyDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ab1z9";
		HashMap<Character,Character> hm=new HashMap<>();
		HashMap<Character,Integer> fq=new HashMap<>();
		int sum=0;
		
        hm.put('a','z');
        hm.put('b','y');
        hm.put('c','x');
        hm.put('d','w');
        hm.put('e','v');
        hm.put('f','u');
        hm.put('g','t');
        hm.put('h','s');
        hm.put('i','r');
        hm.put('j','q');
        hm.put('k','p');
        hm.put('l','o');
        hm.put('m','n');
        hm.put('0','9');
        hm.put('1','8');
        hm.put('2','7');
        hm.put('3','6');
        hm.put('4','5');
        
        for(int i=0;i<s.length();i++) {
        	if(hm.containsKey(s.charAt(i))==true){
        		if(fq.containsKey(s.charAt(i))) {
        			int temp=fq.get(s.charAt(i));
        			fq.put(s.charAt(i),temp+1);
        		}else {
        			fq.put(s.charAt(i),1);
        		}
        	}
        }
        
        
        for(int j=0;j<s.length();j++) {
        	if(hm.containsValue(s.charAt(j))==true){
        		if(fq.containsKey(s.charAt(j))) {
        			int temp=fq.get(s.charAt(j));
        			fq.put(s.charAt(j),temp+1);
        		}else {
        			fq.put(s.charAt(j),1);
        		}
        	}
        }
        
        System.out.println(fq.entrySet());
        
        
        
        
        Set<Character> visited = new HashSet<>();

        for(char f : fq.keySet()) {

            if(visited.contains(f)) continue;

            Character mirror = hm.get(f);

            sum += Math.abs(
                fq.getOrDefault(f, 0) -
                fq.getOrDefault(mirror, 0)
            );

            visited.add(f);
            visited.add(mirror);
        }
        System.out.println(sum);
        
        
		

	}

}
