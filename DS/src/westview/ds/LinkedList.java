package westview.ds;

public class LinkedList {

	//a linked list has a head reference 
	private Node head;
	
	//which refers to the first Node in the list
	
	//a LinkedList has a size which the #
	//a nodes in the list
	private int size;
	
	//add a default constructor 
	
	//getters/setters

	public LinkedList(LinkedList head) {
	head = null;
	size = 0;
	
	}
	
	public void add(Node el) {
	
	if(head == null) {
		head = el;
	}
	//else {
	//for(int i = 0; i < size(); i++) {
	//if(getNext() ==0) {
		//idk
	//}
	//}
	//}
	size ++;
	
	}
	
	public Node get(int index) {
	return null;
	}


	public int getSize() {
	return size;
	
	}

	//add method which adds a node to the LinkedList
	//must be done recursivley 
	
	//method at a given index which returns the 
	//node at the index if the index is valid
	//null otherwise
	
	//add a size method which returns the size of the
	//list
	
}
