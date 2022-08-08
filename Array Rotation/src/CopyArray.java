import java.util.*;
public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//SHALLOW COPY		
		int [] numbers = {1, 2, 3, 4, 5, 6};
		int[] nums=numbers; // copying numbers
		
		for(int i:nums) {
			System.out.print(i+" ");
		}
		
 //This technique is the easiest one and it works as well.
//	However, there is a problem with this technique.
//	If we change elements of one array, 
//	corresponding elements of the other arrays also change. 
		

		
//DEEP COPY
//		int [] source = {1, 2, 3, 4, 5, 6};
//        int [] destination = new int[source.length];
//        for(int i=0;i<source.length;i++) {
//        	destination[i]=source[i];
//        }
//        for(int a:destination) {
//			System.out.print(a+" ");
//		}
        
//using ARRAYCOPY() METHOD:
        //Syntax-> arraycopy(Object src, int srcPos, Object dest, int length);
        int[] n1 = {2, 3, 12, 4, 12, -2};
       int[] n2=new int[n1.length];
        System.arraycopy(n1,0,n2,0,n1.length);
        for(int a:n2) {
			System.out.print(a+" ");
		}
        
//using copyOfRange Method:
//		int[] source = {2, 3, 12, 4, 12, -2};
//		int[] destination= Arrays.copyOfRange(source,0,source.length);
//		System.out.println("destination= "+Arrays.toString(destination));
//		// copying from index 2 to 5 (5 is not included) 
//		int dest[]=Arrays.copyOfRange(source,2,5);
//		System.out.println("dest= "+Arrays.toString(dest));
}
	

}
