package tandpwork;
import java.util.*;
public class IntersectionOfTwoArrays {
	
	/*
	 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
       Output: [9,4]
       Explanation: [4,9] is also accepted.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums1[]= {4,9,5};
		int nums2[] = {9,4,9,8,4};
		Arrays.sort(nums1);
		
		ArrayList<Integer> arr = new ArrayList<>();
        Arrays.sort(nums1);

        int target = 0;

        while(target < nums2.length) {

            int s = 0;  
            int e = nums1.length - 1;

            while(s <= e) {   
                int mid = (s + e) / 2;

                if(nums2[target] == nums1[mid]) {
                    if(!arr.contains(nums2[target])) {
                        arr.add(nums2[target]);
                    }
                    break; 
                }
                else if(nums2[target] > nums1[mid]) {
                    s = mid + 1; 
                }
                else {
                    e = mid - 1;                   
                }
            }

            target++;
        }

        System.out.println(arr);
	}

}
