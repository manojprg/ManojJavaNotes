package cache;

import java.util.Deque;
import java.util.Set;

public class LRUCache {

	private Set<Integer> set;
	private Deque<Integer> deq;
	private int capacity;

	public LRUCache(Set<Integer> set, Deque<Integer> deq, int capacity) {
		this.set = set;
		this.deq = deq;
		this.capacity = capacity;
	}

	public void put(int element) {
		int size = set.size();
		if (!set.contains(element)) {
			if (capacity > size) {
				set.add(element);
				deq.push(element);
			} else if (capacity == size) {
				set.remove(deq.removeLast());
				set.add(element);
				deq.push(element);
			}
		} else {
			deq.remove(element);
			set.remove(element);
			set.add(element);
			deq.push(element);
		}

	}

	public int get(int element) {

		if (!set.contains(element)) {
			return -1;
		}
		return element;

	}

	public void print() {

		for (Integer element : set) {
			System.out.print(element + " -> ");
		}
		System.out.println();
	}

}
