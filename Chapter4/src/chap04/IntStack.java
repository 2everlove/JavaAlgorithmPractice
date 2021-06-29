package chap04;
//int type stack - module

public class IntStack {
	private int max; //stack capability
	private int ptr; //stack pointer
	private int[] stk; //stack contain
	
	//Exception on execute - empty
	public class EmptyIntStackException extends RuntimeException{
		private static final long serialVersionUID = 1L;

		public EmptyIntStackException() {}
	}
	
	//Exception on execute - overflow
	public class OverflowIntStackException extends RuntimeException{
		private static final long serialVersionUID = 1L;
		
		public OverflowIntStackException() {}
	}
	
	//constructor
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];	//create stack contain array
		} catch(OutOfMemoryError e) { //can't create
			max = 0;
		}
	}
	
	//@return x on stack // push a data on stack - 넣기
	public int push(int x) throws OverflowIntStackException{
		if(ptr >= max) //stack full
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	
	
	//@return bottom // pop a data on stack(take a data of peak) - 빼기
	public int pop() throws EmptyIntStackException{
		if(ptr <0 ) //empty stack
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	
	//@return peak data //peak a data on stack(show a data of peak) -- 보기
	public int peak() throws EmptyIntStackException{
		if(ptr<0) //empty stack
			throw new EmptyIntStackException();
		return stk[ptr-1];
	}
	
	//@return index(null -> -1) // search x on stack 
	public int indexOf(int x) {
		for(int i = ptr -1; i>0; i--)
			if(stk[i]==x)
				return i;
		return -1;
	}
	
	//empty stack
	public void clear() {
		ptr=0;
	}
	
	//@return max
	public int capaciry() {
		return max;
	}
	
	//@return ptr // size on stack
	public int size() {
		return ptr;
	}
	
	//@return empty? // is empty
	public boolean isEmpty() {
		return ptr<=0;
	}
	
	//@return full? // is full
	public boolean isFull() {
		return ptr>=max;
	}
	
	//@return all data on stack // bottom -> peak
	public void dump() {
		if(ptr<=0)
			System.out.println("stack is empty");
		else {
			for(int i=0;i<ptr; i++)
				System.out.print(stk[i]+" ");
			System.out.println();
			for(int s : stk)
				System.out.println(s +" ");
			System.out.println();
		}
	}
}
