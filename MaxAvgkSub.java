package tandpwork;
import java.util.*;
public class MaxAvgkSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,12,-5,-6,50,3};
		int k=4;
		double sum=0;
		double max;
		
		
		for(int i=0;i<k;i++) {
			sum=sum+nums[i];
		}
		max=sum;
		
		
		
		for(int j=k;j<nums.length;j++) {
			sum=sum-nums[j-k]+nums[j];
			max=Math.max(max, sum);
		}
		
		
		
		System.out.println(max/k);

	}

}
