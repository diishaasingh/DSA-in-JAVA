

//TWO POINTER TECHNIQUE
//works only in the case of sorted arrays
public class TwoSum {
	static void twoSum(int arr[],int sum) {
		int left=0;
		int right=arr.length-1;
		
		while(left<=right) {
			int ans=arr[left]+arr[right];
			
				if(ans==sum) {
					System.out.println("yes");
					return;
				}
				else if(ans<sum) {
					left++;
				}
				else if(ans>sum) {
					right--;
				}
				
		}
		System.out.println("No solution");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,7,9,10,11,12,14,34,36,49};
		int sum=97;
		twoSum(arr,sum);
	}

}
