//leftsum==rightsum

public class EquilibriumIndex {
	static int index(int[] arr,int n) {
		int lefts, rights;
		
		for(int i=0;i<n;i++) {
			lefts=0; 
			for(int j=0;j<i;j++) {
				lefts+=arr[j];
			}
			rights=0;
			for(int j=i+1;j<n;j++) {
				rights+=arr[j];
			}
			if(lefts==rights) {
				return i;
			}
		
		}
		return -1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
		int n=arr.length;
		System.out.println(index(arr,n));
		
	}

}
