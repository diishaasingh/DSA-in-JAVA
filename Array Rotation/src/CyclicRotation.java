
public class CyclicRotation {
	static void cyclicrotate(int arr[]) {
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			
			arr[i]=arr[i+1];
		
		}
		arr[arr.length-1]=temp;
	}
	static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5};
		int n=arr.length;
		//2 3 4 5 1
		cyclicrotate(arr);
		printArray(arr,n);
		

	}

}
