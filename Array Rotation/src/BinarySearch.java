//Binary search is for sorted arrays only
public class BinarySearch {
	static int Binarysrch(int arr[],int k) {
		int l=0;
		int r=arr.length-1;
		
		while(l<=r) {
			int m=(l+r)/2;
			if(arr[m]==k) {
				return m;
			}
			else if(k>arr[m]) {
				l=m+1;
			}
			else {
				//here the k<arr[m]
				r=m-1;
			}

			}
		return -1;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int arr[]= {5,7,8,10,12,13};
			int k=7;
			System.out.println(Binarysrch(arr,k));

		}
	}