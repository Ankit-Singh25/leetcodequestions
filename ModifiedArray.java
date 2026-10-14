
package tandpwork;
import java.util.*;
/*    int nums[]= {1,5,5,1,6,1};
      output= 5,6,1  
 */

public class ModifiedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]= {1,5,5,1,6,1};
		
		
		LinkedHashSet<Integer> hs=new LinkedHashSet<>();
	
		for(int i=nums.length-1;i>=0;i--) {
			hs.add(nums[i]);
			
			
			
			
		}
		
		
		List<Integer> list = new ArrayList<>(hs);
		Collections.reverse(list);

		System.out.println(list);
		
		

	}

}
