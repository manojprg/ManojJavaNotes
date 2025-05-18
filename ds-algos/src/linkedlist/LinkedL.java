package linkedlist;

public class LinkedL {

	Node add(Node head,int data ) {
		
		Node newNode=new Node(data,null);
		
		if(head==null) {
			head=newNode;
		}else {
		Node temp=head;
		while(temp.next!=null) {
			
			temp=temp.next;
		}
		temp.next=newNode;
		}
		return head;
	}
	
	void remove(Node head,int data) {
		
		Node temp=head;
		Node prev=head;
		while(temp.data!=data) {
			prev=temp;
			temp=temp.next;
			
		}
		prev.next=temp.next;
	}
	
	void print(Node head) {
		Node temp=head;
		System.out.println();
		while(temp!=null) {
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
	}
}
