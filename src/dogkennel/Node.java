package dogkennel;
public class Node {
	Node next;
	Dog data;

	public Node(Dog dog) {
		this.data = dog;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Dog getData() {
		return data;
	}
}
