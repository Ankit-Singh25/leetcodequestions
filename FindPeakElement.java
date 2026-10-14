package tandpwork;
import java.util.*;
public class FindPeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]={1,2,1,3,5,6,4};
		int s = 0;
        int e = nums.length - 1;

        while (s < e) {
            int mid = (s + e) / 2;

            if (nums[mid] > nums[mid + 1]) {
                e = mid;  
            } else {
                s = mid + 1;  
            }
        }
        System.out.println(s);

	}

}
