//difference between array and structure 
//arrays store homogeneous data types while structure(c language) can store different data types
//import java.util.*;
public class MergeSortedArrays {

	//md1 with extra space
	static void merge(int a[],int[]b,int n1,int n2,int[]c) {
		int i=0,j=0,k=0;

		while(i<n1 && j<n2) {
			if(a[i]<b[j]) {
				c[k++]=a[i++];
			}
			else
				c[k++]=b[j++];
		}

		//still some elements remain so for that
		while(i<n1) {
			c[k++]=a[i++];
		}
		while(j<n2) {
			c[k++]=b[j++];
		}
	}
//
	//md2 without extra space
//	static void merge(int n1, int n2,int[] a,int[] b)
//	{
//	    int i = 0, j = 0, k = n2 - n1;
//	    while (i <= k && j < n1) {
//	        if (a[i] < b[j])
//	            i++;
//	        else {
//	            int temp = b[j];
//	            b[j] = a[k];
//	            a[k] = temp;
//	            j++;
//	            k--;
//	        }
//	    }
//	    Arrays.sort(a);
//	    Arrays.sort(b);
//	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 3, 5, 7}, b[] = {1, 3, 5};
		int n1=a.length;
		int n2=b.length;
		
		//merge(n1,n2,a,b,c);
		int c[]=new int[n1+n2];

	merge(a,b,n1,n2,c);
		System.out.println("Array after merging");
		for (int i=0; i < n1+n2; i++)
			System.out.print(c[i] + " ");
	}




}
