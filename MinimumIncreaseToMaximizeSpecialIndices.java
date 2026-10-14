package tandpwork;
import java.util.*;
public class MinimumIncreaseToMaximizeSpecialIndices {
	
	/*
	 Input: nums = [5,2,1,4,3]    sum=(5-2)+1

			Output: 4
			
			nums = [5, 6, 2, 1, 3]

			Output: 3  {2,1,3}-->(2-1)+1=2   {2,3,3} (3-3)+1=1   2+1=3
			
			Explanation:​​​​​​​​​​​​​​​​​​​​​
			
			Start with nums = [5, 2, 1, 4, 3].
			Perform 4 operations at index 1, array becomes [5, 6, 1, 4, 3].
			The final array is [5, 6, 1, 4, 3] has 2 special indices, which is the maximum achievable. Thus, the answer is 4.
			
			
			idea:
			if i=j    srif left side (i-mid)+1
            if i>j    srif left side (i-mid)+1
            if i<j   ( left side (i-mid)+1)+----->mid update krke(right side (j-mid)+1)

			
			
			​​​​​​​

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {3,1,3,1,3,1,3};
		int mid=0;
		int sum=0;
		int count=0;
		
		
		for(int i=0;i<nums.length;i+=2) {
			for(int j=i+2;j<nums.length;j+=2) {
				mid=(j+i)/2;
				
				if(nums[mid] > nums[i] && nums[mid] > nums[j]) {
					i=j;
				}else if(nums[i]==nums[j] || nums[i]>nums[j]) {
					count=count+(nums[i]-nums[mid])+1;
					break;
					
				}else {
					sum=count+(nums[i]-nums[mid])+1; 
					nums[mid]=nums[mid]+sum;  
					int s=(nums[j]-nums[mid])+1; 
					count=count+(sum+s);
					break;
					
					
				}
				
			}
		}
		System.out.println(count);
		
		

	}

}
