package tandpwork;
import java.util.*;
public class HouseRobber {
	/*
	   Input: nums = [2,7,9,3,1]
       Output: 12
		Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
		Total amount you can rob = 2 + 9 + 1 = 12.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {2,7,9,3,1};
		
		
		
		int evenProfit=0;
		int oddProfit=0;
		
		for(int i = 0; i < nums.length; i += 2){
            evenProfit += nums[i];
        }

        // odd index houses
        for(int i = 1; i < nums.length; i += 2){
            oddProfit += nums[i];
        }
		
		System.out.println(Math.max(evenProfit, oddProfit));
		

	}
}

