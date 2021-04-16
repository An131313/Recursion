package eight;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

public class NameQueues {
	public static void main(String[] args) {
		PriorityQueue<String> namesQueue1 = new PriorityQueue<>(Arrays.asList(
				"George", "Jim", "John", "Blake", "Kevin", "Michael"));
		PriorityQueue<String> namesQueue2 = new PriorityQueue<>(Arrays.asList(
				"George" , "Katie" , "Kevin" , "Michelle" , "Ryan"));
		
		System.out.println("Union: " + union(namesQueue1, namesQueue2));
		System.out.println("Intersection: " + intersection(namesQueue1, namesQueue2));
		System.out.println("Difference: " + difference(namesQueue1, namesQueue2));
		System.out.println(namesQueue1);
		System.out.println(namesQueue2);
	}
	private static <T> PriorityQueue<T> union(PriorityQueue<T> set1, PriorityQueue<T> set2) {
		PriorityQueue<T> union = new PriorityQueue<>(set1);
		union.addAll(set2); 
		HashSet <String> set = (HashSet<String>) new HashSet <> (union); //a set doesn't allow duplicates
		//union.removeAll(intersection(set1, set2));
		PriorityQueue<String>queue = new PriorityQueue<>(set);
		return (PriorityQueue<T>) queue;
	}
	
	private static <T> PriorityQueue<T> intersection(PriorityQueue<T> set1, PriorityQueue<T> set2) {
		PriorityQueue<T> intersection = new PriorityQueue<>(set1);
		intersection.retainAll(set2);
		return intersection;
	}
	
	private static <T> PriorityQueue<T> difference(PriorityQueue<T> set1, PriorityQueue<T> set2) {
		PriorityQueue<T> difference = new PriorityQueue<>(set1);
		difference = union(set1, set2);
		difference.removeAll(intersection(set1, set2));
		return difference;
	}
}
