package chap04;
//Queue type int

public class IntQueue {
	private int max; //capability of queue
	private int front; // first cursor of factor
	private int rear ; //last cursor of factor
	private int num; //current number of data
	private int[] que;
	
	//exception of execute : empty queue 
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}

	//exception of execute : full queue
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}

	public IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max]; // create array for queue
		} catch(OutOfMemoryError e) { // can't create!!
			max = 0;
		}
	}
	
	//input data in queue
	public int enque(int x) throws OverflowIntQueueException{
		if(num>=num)
			throw new OverflowIntQueueException(); // full queue
		que[rear++] = x;
		num++;
		if(rear == max)
			rear = 0;
		return x;
	}

}

