package linkedlist;

public class Node {

	int data;
	Node next;

	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNode() {
		return next;
	}

	public void setNode(Node next) {
		this.next = next;
	}

}
