package westview.ds;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesterQueue {

	@Test
	void test() {
		
	Queue<Integer> myQueue = new Queue<Integer>();

	assert(myQueue.size() == 0);
	
	assert(myQueue.dequeue() == null);
	
	assert(myQueue.dequeue() == null);
	
	
	}

}
