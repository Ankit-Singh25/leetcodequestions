package tandpwork;

import java.util.*;

public class MinimumDistanceBetweenThreeEqualElements {
	/*
	 *  tuple (i, j, k) of 3 distinct indices is good if nums[i] == nums[j] == nums[k].

        The distance of a good tuple is abs(i - j) + abs(j - k) + abs(k - i), where abs(x) denotes the absolute value of x.

        Return an integer denoting the minimum possible distance of a good tuple. If no good tuples exist, return -1.
	 */

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int nums[] = {1,2,1,1,3};
		
		HashMap<Integer, List<Integer>> hm = new HashMap<>();
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<nums.length;i++) {
			if(hm.containsKey(nums[i])) {
				hm.get(nums[i]).add(i);
			}else {
				List<Integer> list = new ArrayList<>();
                list.add(i);
                hm.put(nums[i], list);
			}
		}
		
		for(List<Integer> list : hm.values()) {

		    if(list.size() >= 3) {

		        for(int i = 0; i <= list.size()-3; i++) {

		            int first = list.get(i);
		            int second = list.get(i+1);
		            int third = list.get(i+2);

		            int distance = Math.abs(first-second)
		                         + Math.abs(second-third)
		                         + Math.abs(third-first);

		            min = Math.min(min, distance);
		        }
		    }
		}
		System.out.println(min == Integer.MAX_VALUE ? -1 : min);
		
		

	}

}
