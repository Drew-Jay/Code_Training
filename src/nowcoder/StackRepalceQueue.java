package nowcoder;

import java.util.Stack;

public class StackRepalceQueue {

	/**
	 * 题目描述
	 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
	 */
	
	 	Stack<Integer> stack1 = new Stack<Integer>();
	    Stack<Integer> stack2 = new Stack<Integer>();
	    
	    public void push(int node) {
	        stack1.push(node);
	    }
	    
	    public int pop() {
	    	if(stack2.isEmpty()){
	    		while(!stack1.isEmpty())
	    			stack2.push(stack1.pop());
	    	}
	    	if(!stack2.isEmpty()){
	    		return stack2.pop().intValue();
	    	}
			return 0;
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackRepalceQueue SRQ = new StackRepalceQueue();
		SRQ.pop();
		SRQ.push(1);
		SRQ.push(2);
		SRQ.pop();
		SRQ.push(3);
		SRQ.pop();
		SRQ.push(4);
		SRQ.push(5);
		SRQ.pop();
		SRQ.push(6);
		SRQ.pop();
		SRQ.pop();
		SRQ.pop();
	}

}
