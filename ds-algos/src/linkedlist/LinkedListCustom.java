package linkedlist;

public class LinkedListCustom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedL ll = new LinkedL();
		Node head = ll.add(null, 10);
		ll.add(head, 20);
		ll.add(head, 30);

		ll.print(head);
		ll.remove(head, 20);
		ll.print(head);
	}

}
