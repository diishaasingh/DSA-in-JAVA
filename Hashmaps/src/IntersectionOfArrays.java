import java.util.*;
public class IntersectionOfArrays {
	
	static void intersection(int arr1[],int arr2[]) {
		if(arr1.length==0 || arr2.length==0) {
			return ;
		}
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr1.length;i++) {
			if(map.containsKey(arr1[i])) {
				int value=map.get(arr1[i]);
				map.put(arr1[i],value+1);
			}
			else {
				map.put(arr1[i],1);
			}
		}
		
		for(int i=0;i<arr2.length;i++) {
			if(map.containsKey(arr2[i])) {
				int freq=map.get(arr2[i]);
				if(freq>0) {
					System.out.println(arr2[i]+" ");
					map.put(arr2[i],freq-1);
				}
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {2 ,6 ,8 ,5,4, 3};
		int arr2[]= {2,3, 4, 7 };
		intersection(arr1,arr2);
		
		

	}

}
