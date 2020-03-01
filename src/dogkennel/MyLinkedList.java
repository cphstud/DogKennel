package dogkennel;
public class MyLinkedList {
	private Node head;
	
	public void addNode(Dog dog) {
		if (head == null) {
			Node node = new Node(dog) ;
			this.head = node;
		} else {
			Node node = new Node(dog) ;
			node.setNext(head);
			this.head = node;
		}
	}
	
	
}
