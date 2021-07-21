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
		if(num >= max)
			throw new OverflowIntQueueException(); // full queue
		que[rear++] = x;
		num++;
		if(rear == max)
			rear = 0;
		return x;
	}
	
	//dequeue data in queue
	public int deque() throws EmptyIntQueueException{
		if(num<=0)
			throw new EmptyIntQueueException(); // empty queue
		int x = que[front++];
		num--;
		if(front == max)
			front = 0;
		return x;
	}
	
	//peak for data on queue (front data)
	public int peek() throws EmptyIntQueueException{
		if(num<=0)
			throw new EmptyIntQueueException();
		return que[front];
	}
	
	//search x on queue
	public int indesOf(int x) {
		for(int i =0 ; i<num ; i++) {
			int idx = (i+front)%max;
			if(que[idx]==x)
				return idx;
		}
		return -1;
	}
	
	public int search(int x) {
		for(int i = 0 ; i<num; i++) {
			int idx = (i+front)%max;
			if(que[idx] == x)
				return idx+1;
		}
		return 0;
	}
	
	//clear queue
	public void clear() {
		num = front = rear = 0;
	}
	
	//capacity of queue
	public int capacity() {
		return max;
	}
	
	//return number of data on queue
	public int size() {
		return num;
	}
	
	public boolean isEmpty() {
		return num <= 0;
	}
	
	public boolean isFull() {
		return num >= max;
	}
	
	public void dump() {
		if(num<=0)
			System.out.println("Queue is empty");
		else {
			for(int i = 0; i < num; i++)
				System.out.print(que[(i+front)%max]+" ");
			System.out.println();
		}
	}

}

