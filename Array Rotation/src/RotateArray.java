//java program to rotate an array of size n by d elements
//[1 2 3 4 5 6 7] --> [3 4 5 6 7 1 2]
public class RotateArray {
	//method 1 :left rotate
	static void leftRotatebyOne(int a[],int n) {
		int temp=a[0];
		for(int i=0;i<n-1;i++) {
			a[i]=a[i+1];
		}
		a[n-1]=temp;
	}
	static void leftRotate(int a[],int d, int n) {
		for(int i=0;i<d;i++) {
			leftRotatebyOne( a, n);
		}
	}
	
	static void printArray(int a[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
	
 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		leftRotate(a,2,7);
		printArray(a, 7);
		
	}

}
