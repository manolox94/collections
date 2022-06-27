package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;

public class collection {
	public static void main(String args[]){
		  
		TreSet();


	}
	// LIST
	
	public static void arrayL() {
		ArrayList al=new ArrayList();  // creating array list
		al.add("Pedro");                // adding elements    
		al.add("Estef");
		al.add("Cesar");
		
		System.out.println(al.size());
		al.clear();
		System.out.println(al.size());

		Iterator itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}		
	}
	
	public static void linkedLis() {
        LinkedList<String> al=new LinkedList<String>();// creating linked list 
        al.add("Cesar"); // adding elements 
        al.add("Res"); 
        al.add("tres"); 
        
        System.out.println( al.contains("Cesar"));
        
        al.addFirst("test"); 
        al.remove("Res");
        System.out.println(al.indexOf("tres") + " index");

        Iterator<String> itr = al.iterator();
        while(itr.hasNext()){ 
            System.out.println(itr.next());
        }		
	}
	
	public static void vector() {
		Vector object = new Vector(3,5);
		object.add(2);
		object.add("der");
		object.add("der2");
		object.add("der3");
		object.add("der5");
		object.add("der6");
		
		object.remove("der5");

		System.out.println(object);
		System.out.println(object.size());
		System.out.println(object.lastIndexOf("der3"));

	}
	
	
	// QUEUE
	
	public static void queue() {

		PriorityQueue<String> queue=new PriorityQueue<String>(); 
		// creating priority queue 
		queue.add("Amit"); 
		// adding elements 
		queue.add("Rachit");
		queue.add("Rahul"); 
		queue.add("rodolfo");
		System.out.println("head:"+queue.element()); 
		System.out.println("head:"+queue.peek()); 
		System.out.println("iterating the queue elements:"); 
		Iterator itr=queue.iterator(); 
		while(itr.hasNext()){ 
			System.out.println(itr.next()); 
		} 
		queue.remove("rodolfo");
		System.out.println("after removing first elements:"); 
		Iterator<String> itr1=queue.iterator(); 
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}

		queue.poll(); 
		System.out.println("after removing two elements:"); 
		Iterator<String> itr2=queue.iterator(); 
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
	}
	
	// SETS
	
	public static void hashSet() {
		HashSet al=new HashSet(); // creating hashSet
		al.add("Rachit");                 // adding elements
		al.add("Amit");
		al.add("jack");
		
		
		al.remove("Amit");
		System.out.println(al.iterator());
		System.out.println(al.isEmpty());
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	
	public static void LinkedHashSet() {
		
		
		java.util.LinkedHashSet al=new java.util.LinkedHashSet(); // creating linkedhashset
		al.add("Sam");
		al.add("Mariana");                            // adding elements 
		al.add("Rick");
		
		
		Iterator  itr=al.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
		
	}
	
	public static void TreSet() {
		
		HashSet al2=new HashSet(); // creating hashSet
		al2.add("Test");
		
		
		TreeSet al=new TreeSet();  // creating treeSet
		al.add("John");                            // adding elements
		al.add("Sam");
		al.add("Rick");
		
		al.addAll(al2);
		
		
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	
}
