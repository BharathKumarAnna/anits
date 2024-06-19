package stackandqueue;

import java.util.*;

public class stackjcf1 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
//		stack.pop();
		System.out.println(stack);
		System.out.println(stack.isEmpty());
		stack.remove(2);
		System.out.println(stack);
		
		
	}

}
