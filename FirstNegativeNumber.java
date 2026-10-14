package tandpwork;
import java.util.*;

/*
 * Find First Negative element of each sub-array of size k. 
   (return answer in form of an array or list and in case there is no negative element in the sub-array of size k, 
   then put a 0 for that sub-array)
 */
public class FirstNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {12, -1, -2, 8, -16, 30, 16, 28};
        int k = 3;
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> result=new ArrayList<>();
        
        
        for(int i=0;i<k;i++) {
        	if(nums[i]<0) {
        		arr.add(i);
        	}
        }
        if (!arr.isEmpty()) {
            result.add(nums[arr.get(0)]);
        } else {
            result.add(0);
        }
        
        for (int j = k; j < nums.length; j++) {

            // Remove elements out of window
            if (!arr.isEmpty() && arr.get(0) <= j - k) {
                arr.remove(0);
            }

            // Add new element if negative
            if (nums[j] < 0) {
                arr.add(j);
            }

            // Add answer
            if (!arr.isEmpty()) {
                result.add(nums[arr.get(0)]);
            } else {
                result.add(0);
            }
        }

        System.out.println(result);

	}

}
