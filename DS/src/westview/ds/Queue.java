package westview.ds;

import java.util.ArrayList;

public class Queue<Q> {

	private ArrayList<Q> data;
	
	public Queue() {
	
	data = new ArrayList<Q>();
		
	}
	
	//ADD
	public void enqeue(Q element) {
	data.add(element);
		
	}
	
	//REMOVE
	public Q dequeue() {
		
	if(data.size() == 0 ) {
		return null;
	}
	return data.remove(data.size() -1);
	}
	
	
	public Q peek() {
	if(data.size() == 0) {
		return null;
	}
	return data.get(data.size()-1);
	}
	
	
	public int size() {
		return data.size();

		
	}
	
	}
	
 
