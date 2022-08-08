
public class LinearSearch {

	static void Linearsrch (int arr[] ,int target) {
		int count=0;
		for(int i=0; i<arr.length;i++) {
			if(target==arr[i]) {
				System.out.println(i);
			count=count+1;
			}
		}
		if(count==0) {
		System.out.println("item not found!!");
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,16,10,5,7};
		//int n=arr.length;
		//int k=7;
		//LinearS(arr,n,k);
		Linearsrch(arr,7);

	}

}
