//Given an array of size N containing only 0s, 1s, and 2s
//sort the array in ascending order.
public class ZeroesOnesTwos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int n = 5;
				int arr[]= {0 ,2 ,1, 2, 0};
				//Output:0 0 1 2 2
	int c0=0 ,c1=0;
   for(int i=0;i<n;i++) {
	   if(arr[i]==0) {
		   c0++;
	   }
	   if(arr[i]==1) {
		   c1++;
	   }
   }
	for(int i=0;i<c0;i++) {
		arr[i]=0;
	}
	for(int i=c0;i<c0+c1;i++) {
		arr[i]=1;
	}
	for(int i=c1+c0;i<n;i++) {
		arr[i]=2;
	}

	
	for(int ele:arr) {
		System.out.println(ele);
	}
	}

}
