import java.util.*;
public class MaxFrequencyElement {
	static int freq(int arr[] ) {
		
		HashMap<Integer,Integer> map=new HashMap();
		
		 for(int i=0;i<arr.length;i++) {
			 if(!map.containsKey(arr[i])) {
				 map.put(arr[i],1);
			 }
			 else {
				 int value=map.get(arr[i]);
				 value++;
				 map.put(arr[i],value);
			 }
		 }

				int maxFreq = 0;
				int max = Integer.MIN_VALUE;
				for(int x : arr) {
					if( maxFreq < map.get(x) ) {
						maxFreq = map.get(x);
						max = x;
					}
				}
				return max;
	
	}

	
//	static int countMax(HashMap<Integer,Integer> ) {
//		int max_freq=0;
//		int max=Integer.MIN_VALUE;
//		for(int i:map) {
//			if(max<map.get(arr[i])) {
//				max_freq=map.get(arr[i]);
//				max=i;
//			}
//		}
//		return max;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,12,2,11,12,2,1,2,2,11,12,2,6 };
		System.out.println(freq(arr));
		

	}

}
