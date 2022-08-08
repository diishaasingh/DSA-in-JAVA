
public class AllNegativestoOneside {
	//md1
//	static void rearrange(int[] arr,int n) {
//		int j=0;
//		for(int i=0;i<n;i++) {
//			if(arr[i]<0) {
//				if(i!=j) {
//				int temp=arr[j];
//				arr[j]=arr[i];
//				arr[i]=temp;
//			}
//			j++;
//			}
//		}
//	}
	//md2 two pointer approach
	static void moveNegative(int[] arr) {
		int l=0;
		int r=arr.length-1;
		while(l<=r) {
			if(arr[l]>0 && arr[r]<0) {
				int temp=arr[l];
				arr[l]=arr[r];
				arr[r]=temp;
				l++;
				r--;
			}
			else if(arr[l]<0 && arr[r]<0) {
				l++;
			}
			else if(arr[l]<0 && arr[r]>0) {
				r--;
			}
			else {
				l++;
				r--;
			}
		}
		
	}

	

	static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int n = arr.length;
       //rearrange(arr,n);
        moveNegative(arr);
       printArray(arr,n);
 

	}

}
