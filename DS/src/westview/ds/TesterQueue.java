package westview.ds;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesterQueue {

	@Test
	void test() {
		
	queue<Integer> myQueue = new queue<Integer>();

	assert(myQueue.size() == 0);
	
	assert(myQueue.dequeue() == null);
	
	assert(myQueue.dequeue() == null);
	
	
	}

}
