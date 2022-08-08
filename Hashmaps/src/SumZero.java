import java.util.*;
public class SumZero {
	static int pairsum(int arr[]) {
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				int val=map.get(arr[i]);
				val++;
				map.put(arr[i],val);
			}
			else {
				map.put(arr[i],1);
			}
         }
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(-arr[i])) {
				count++;
			}
		}
		return count/2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[]= {7,2,8,-5,-2,5};
 System.out.println(pairsum(arr));
	}

}
