import java.util.*;
public class Inbuilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <String,Integer> map=new HashMap<>();
		
	 //insert
	  map.put("abc",1);
	  map.put("def",3);
	  
	  //check presence
	  if(map.containsKey("abc")) {
		  System.out.println("map contains abc");
	  }
	  if(map.containsKey("abc1")) {
		  System.out.println("map contains abc1");
	  }
	  //get value
	  int v=map.get("abc");
	  System.out.println(v);
	  
	  System.out.println(map.get("def"));
	  
	  //remove
//	  map.remove("abc");
//	  System.out.println(map);
//	  
	  //clear
//	  map.clear();
//	  System.out.println(map);
//	  
	  //iterate
	 // .keyset()  this gives the keys in the form of a set
	  //Set<String> keys=map.keySet();
	  for(String i:map.keySet()) {
		  System.out.println(i +"="+map.get(i));
	  }

	}

}
