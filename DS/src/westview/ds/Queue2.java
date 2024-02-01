package westview.ds;
import java.util.ArrayList;

public class Queue2<T>{

	//use Stack(s) - you must use 2 stacks
	
	Stack<T> a;
	Stack<T> b;

	
	public Queue2() {
	Queue<T> first = new Queue();
	Queue<T> second = new Queue();
	}
	
	
	public T dequeue() {
	
	if(b.size()==0) {
		return null;
	}
	return b.add(a.size()-1);
	return a.remove(a.size()-1);
	return b.add(a.size()-1);	
	return 	a.remove(a.size()-1);

		
	}
	
	public int size() {
		return a.size();
		
	}
	
	public boolean empty() {
	if(a.size() == 0) {
		return true;
	}
		return false;
	}
	
	public T peek() {
	
	if(A.size() == 0) {
		return null;
	}
	return a.get(a.size()-1);
	}
	
	
	
	public void enqeue(T element) {
	a.push(element);
		
	}
}
