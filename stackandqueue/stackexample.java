package stackandqueue;

import java.util.*;

public class stackexample {
	private ArrayList<Integer> stack;
	private int maxSize;
	
	public stackexample(int maxSize) {
		this.maxSize = maxSize;
		this.stack = new ArrayList<>();
	}
	
	public void push(int item) {
		if(!isFull()) {
			stack.add(item);
		}
	}
	
	public int pop() {
        if(!isEmpty()) {
        	int popedElement = stack.remove(stack.size()-1);
            return popedElement;
        }
        else {
        	return -1;
        }
    }
	
	public boolean isEmpty() {
        return stack.size() == 0;
    }
	
	public boolean isFull() {
		return stack.size() == maxSize;
	}
	public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return stack.get(stack.size()-1);
    }



	
	public static void main(String[] args) {
		stackexample stack = new stackexample(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		
		while(!stack.isEmpty()) {
	            System.out.println(stack.peek());
	            stack.pop();
		
	}
		System.out.println(stack.isFull());
}
}
	

