package westview.ds;
import java.util.ArrayList;

public class Queue2<T>{

	//use Stack(s) - you must use 2 stacks
	
	Stack<T> a;
	Stack<T> b;

	
	public Queue2() {

	}
	
	
	public T dequeue() {
	
	if(b.size()==0) {
		return (T) a.pop();
	}
	else {
		for(int i = 0; i < a.size(); i++) {
			b.push(a.pop());
		}
		return (T) b.pop();
		
	}
	}
	
	public int size() {
		return a.size();
		
	}
	
	public boolean empty() {
	if(a.size() == 0 && a.size() == 0) {
		return true;
	}
		return false;
	}
	
	public void enqeue(T element) {
	a.push(element);
		
	}
}
