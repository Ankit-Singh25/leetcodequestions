package tandpwork;
import java.util.*;
public class SingleNumberIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,1,3,2,5};
		Arrays.sort(nums);
        int arr[]=new int[2];
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<nums.length;i++){
            if(st.isEmpty()==true){
                st.push(nums[i]);
            }else if(st.peek()==nums[i]){
                st.pop();
            }else{
                st.push(nums[i]);
            }
        }

        for(int j=0;j<arr.length;j++){
            arr[j]=st.pop();
        }

        
        System.out.println(Arrays.toString(arr));
		

	}

}
