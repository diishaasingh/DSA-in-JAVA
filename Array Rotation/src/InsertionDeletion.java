import java.util.*;
public class InsertionDeletion {
	//insertion

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList<String> list= new ArrayList<>();//creating an arraylist
//		//adding elements in the arraylist
//		list.add("Ramesh");
//		list.add("Suresh");
//		list.add("mahesh");
//		list.add("kamlesh");
//		list.add("Vinay");
//		list.add("Arvind");
//		list.add("Randeep");
//		
//		//iterating through the list
//		Iterator itr=list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		
//		LinkedList<String> al=new LinkedList<String>();  
//		al.add("Ravi");  
//		al.add("Vijay");  
//		al.add("Ravi");  
//		al.add("Ajay");  
//		Iterator<String> itr=al.iterator();  
//		while(itr.hasNext()){  
//		System.out.println(itr.next());  
//		}
		
		
//		Vector<String> v=new Vector<String>();  
//		v.add("Ayush");  
//		v.add("Amit");  
//		v.add("Ashish");  
//		v.add("Garima");  
//		Iterator<String> itr=v.iterator();  
//		while(itr.hasNext()){  
//		System.out.println(itr.next());  
//		}  
		
//		

//		
//		PriorityQueue<String> queue=new PriorityQueue<String>();
//		queue.add("Amit Sharma");  
//		queue.add("Vijay Raj");  
//		queue.add("JaiShankar");  
//		queue.add("Raj");  
//		System.out.println("head: "+queue.element());
//		System.out.println("head: "+queue.peek());
//		Iterator<String> itr=queue.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		queue.remove();
//		queue.poll();
//		System.out.println("head: "+queue.peek());
//		Iterator<String> itr2=queue.iterator();
//		while(itr2.hasNext()) {
//			System.out.print(itr2.next()+" ");
//		}
		
//		Deque<String> deque=new ArrayDeque<String>();
//		deque.add("Gautam");  
//		deque.add("Karan");  
//		deque.add("Ajay"); 
		//traversing md1
//		Iterator<String> itr=deque.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//     	}
		// traversing md2
//		for(String str:deque) {
//			System.out.println(str);
//		}
//		
//		
		
		
//		HashSet<String> set=new HashSet<String>();  
//		set.add("Ravi");  
//		set.add("Vijay");  
//		set.add("Ravi");  
//		set.add("Ajay");  
//		Iterator<String> itr=set.iterator();  
//		while(itr.hasNext()){  
//		System.out.println(itr.next());  
//		}  
//		
		
		
//		LinkedHashSet<String> set=new LinkedHashSet<String>();  
//		set.add("Ravi");  
//		set.add("Vijay");  
//		set.add("Ravi");  
//		set.add("Ajay");  
//		Iterator<String> itr=set.iterator();  
//		while(itr.hasNext()){  
//		System.out.println(itr.next());  
//		}  
		
		TreeSet<String> set=new TreeSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		//traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
	}

}


