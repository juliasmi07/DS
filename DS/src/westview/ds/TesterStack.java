package westview.ds;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesterStack {

	@Test
	void test() {
		Stack<Integer> myStack = new Stack<Integer>();
		
		//an empty stack should return a size 0 
		assert(myStack.size() == 0);
		
		//can we try the top
		assert(myStack.pop() == null); //empty
	
			//assertion about peek method 
		assert(myStack.peek()==null);
	
		//push to the Stack twice
		//make an assertion about what should be true
		myStack.push(7);
		myStack.push(11);
		assert(myStack.size() == 2);
		assert(myStack.peek()==11);
		
		assert(myStack.pop()==11);
		
		//check that size changed and the new top is what is expected
		
		assert(myStack.peek()==7);
		assert(myStack.size()==1);


	}

}
