import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class ListsExample {
	public static void main(String[] args) {

		// ArrayList and Linked List is same but their difference lies 
		//on the time complexity. Add and remove is better in Linked List
		// but get is slower in Linked list than arraylist

		List<Integer> lst1 = new ArrayList<Integer>();

		lst1.add(2);
		lst1.add(6);
		lst1.add(4);
		lst1.add(8);
		lst1.add(2);

		System.out.println("Arraylist:" + lst1);

		List<Integer> lst2 = new LinkedList<Integer>();

		lst2.add(2);
		lst2.add(6);
		lst2.add(4);
		lst2.add(8);
		lst2.add(2);

		System.out.println("LinkedList: " + lst2);

		/**************************Set********************/
		/*
		 * Set has no duplicates 
		 * 
		 * 
		 * HashSet is better than Linked HashSet and TreeSet in terms of complexity
		 * TreeSet is slowest
		 * 
		 */

		System.out.println("\nHashset stores in random order" +
				"\n LinkedHashSet maintains the order" +
				"\n treeset maintains sorted order\n ");
		HashSet<String> set1 = new HashSet<String>();

		set1.add("apple");
		set1.add("ball");
		set1.add("dog");
		set1.add("cat");
		set1.add("ball");

		System.out.println("HashSet: " + set1);

		LinkedHashSet<String> set2 = new LinkedHashSet<String>();

		set2.add("apple");
		set2.add("ball");
		set2.add("dog");
		set2.add("cat");
		set2.add("ball");
		System.out.println("LinkedHashSet:" + set2);


		TreeSet<String> set3 = new TreeSet<String>();

		set3.add("apple");
		set3.add("ball");
		set3.add("dog");
		set3.add("cat");
		set3.add("ball");
		System.out.println("TreeSet:" + set3);

		//Queue
		/*
		 * Has duplicates, FIFO rule
		 * usually done using Linked list 
		 */
		Queue<String> q = new LinkedList<String>();

		q.add("apple");
		q.add("ball");
		q.add("dog");
		q.add("cat");
		q.add("ball");

		System.out.println("\nQueue: " + q +
				"\nRemove in queue: " + q.remove() +
				"\nhead in Queue: " + q.peek() +
				"\nremove head in queue: " + q.poll() +
				"\nQueue after remove: " + q);

		//PriorityQueue
		/*
		 * Based on the priority, doesn't care about FIFO or LIFO
		 * For example: If we have to do multiple tasks, we tend to do
		 * tasks which are of most priority soon than those with least priority
		 * Similar is the concept of priority queue
		 */

		PriorityQueue<String> q1 = new PriorityQueue<String>();

		q1.add("apple");
		q1.add("ball");
		q1.add("dog");
		q1.add("cat");
		q1.add("ball");

		System.out.println("\nPriorityQueue: " + q1 +
				"\nRemove in priority queue: " + q1.remove() +
				"\nhead or the most priority value in priority Queue: " + q1.peek() +
				"\nremove head in priority queue: " + q1.poll());


		// Using iterators
		/*
		 * Similar to loop
		 * 		 
		 * Iterators can be used in list and set but
		 * ListIterator can only be used in list
		 * 
		 * ListIterator iterates in both forward and  backward direction
		 * while iterator only in forward direction
		 */

		List<Integer> s = new ArrayList<Integer>(10);
		
		//comment the above and writing the following give error in listIterator
		//Set<Integer> s = new HashSetInteger>(10);  
		
		for (int i= 0; i < 10; i++) {
			s.add(i);
		}

		Iterator iter = s.iterator();
		System.out.print("\nUsing Iterator: ");
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");	
		}

		ListIterator iter2 = s.listIterator();
		System.out.print("\nUsing ListIterator (Forward): ");
		
		while(iter2.hasNext()) {
			System.out.print( iter2.next() + " ");	
		}

		System.out.print("\nUsing ListIterator (Backward): ");
		while(iter2.hasPrevious()) {
			System.out.print( iter2.previous() + " ");	
		}


	}
}
