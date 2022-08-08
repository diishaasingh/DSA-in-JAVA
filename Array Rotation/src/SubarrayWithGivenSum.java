import java .util.*;
public class SubarrayWithGivenSum {
	int[] arr= {1,2,3,7,5};
	int n=arr.length;
	int s=12;
	
	static void subarraySum(int[] arr, int n, int s) {
	int sum=0;
    int start=0;
    for(int i=0;i<n;i++){
        sum=sum+arr[i];
        while(sum>s){
            sum=sum-arr[start++];
        }
        if(sum==s)
         System.out.println(start+" "+i+1);
    }
   System.out.println("No subarray found");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subarraySum(arr,5,12);

	}

}
