package cache;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LRUCacheMain {

	public static void main(String[] args) {

		LRUCache cache = new LRUCache(new LinkedHashSet<Integer>(), new LinkedList<>(), 5);
		cache.put(1);
		cache.put(2);
		cache.put(3);
		cache.put(4);
		System.out.println("Added 4th element");
		cache.print();
		cache.put(5);
		System.out.println("Added 5th element");
		cache.print();
		cache.put(6);
		System.out.println("Added 6th element");
		cache.print();
		cache.put(7);
		System.out.println("Added 7th element");
		cache.print();
		cache.put(4);
		System.out.println("Adding 4th element");
		cache.print();
	}

}
