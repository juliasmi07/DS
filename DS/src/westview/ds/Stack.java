package westview.ds;

import java.util.ArrayList;

public class Stack<T> {
	
	//implement storing the data using a 1D array
	private ArrayList<T> data;
	
	//add a constructor 
	public Stack() {
		
	data = new ArrayList<T>();
		
	}
	
	//return null if empty
	public T pop() {
	
		//what to return 
		if(data.size()==0) {
			return null;
		}
	return data.remove(data.size() -1);
	
	}
	
	//preview what is at the top of the Stack
	public T peek() {
	
	//return the val at the top of the Stack
	//don't remove it
	if(data.size() == 0) {
		return null;
	}
		return data.get(data.size()-1);
	
	}
	
	public int size() {
		return data.size();
		
	}
	
	public void push(T element){
		
		//add the element to the top of the Stack
		data.add(element);
	}

	
	
	}
