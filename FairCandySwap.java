package tandpwork;
import java.util.*;
public class FairCandySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aliceSizes[]= {2};
		int bobSizes[]= {1,3};
		int answer[]=new int[2];
		for(int i=0;i<aliceSizes.length;i++){
            for(int j=0;j<bobSizes.length;j++){
                int temp=aliceSizes[i];
                aliceSizes[i]=bobSizes[j];
                bobSizes[j]=temp;

                int alice=Arrays.stream(aliceSizes).sum();
                int bob=Arrays.stream(bobSizes).sum();

                if(alice==bob){
                    answer[0]=bobSizes[i];
                    answer[1]=aliceSizes[j];
                    break;
                }else{
                    int t=aliceSizes[i];
                    aliceSizes[i]=bobSizes[j];
                    bobSizes[j]=t;

                }

            }break;
        }
        System.out.println(Arrays.toString(answer));

	}

}
