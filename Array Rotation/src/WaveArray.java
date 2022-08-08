//Given a sorted array arr[] of distinct integers. 
//Sort the array into a wave-like array(In Place).
//In other words, arrange the elements into a sequence such that 
//arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....
public class WaveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int n = 6;
     int a[] = {2,4,7,8,9,10};
     //expected output= { 4 2 8 7 9 10}
     
     for(int i=0;i<n-2;i+=2) {
    	 int temp=a[i+1];
         a[i+1]=a[i];
         a[i]=temp;
     }
     for(int ele:a) {
    	 System.out.print(ele+" ");
     }
     

	}

}
